package org.tony.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DbConnection {
    private static final String propertiesPath = "src/main/resources/org/tony/db.properties";

    public static Connection createDbConnection() throws SQLException, ClassNotFoundException {
        final Properties properties = getConnectionProperties();
        final String host = properties.getProperty("db.host");
        final String username = properties.getProperty("db.username");
        final String password = properties.getProperty("db.password");
        return DriverManager.getConnection(host, username, password);
    }

    public static Properties getConnectionProperties() {
        Properties properties = new Properties();
        try(FileInputStream in = new FileInputStream(propertiesPath)) {
            properties.load(in);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void getAllTables() {
        try (Connection conn = createDbConnection()) {
            DatabaseMetaData metaData = conn.getMetaData();
            String[] types = {"TABLE"};
            ResultSet rs = metaData.getTables(null, null, "%", types);
            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
