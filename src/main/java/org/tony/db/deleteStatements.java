package org.tony.db;

import org.tony.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class deleteStatements {
    
    public static void deleteFromStarWarsApiDb(StarWarsObj starWarsObj) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getDeleteFromPreparedStatement(starWarsObj, conn);
        preparedStatement.executeUpdate();
    }

    public static PreparedStatement getDeleteFromPreparedStatement(StarWarsObj starWarsObj, Connection conn) throws SQLException {
        PreparedStatement preparedStatement;
        if (starWarsObj instanceof People) {
            preparedStatement = getDeleteFromPreparedStatement((People) starWarsObj, conn);
        } else if (starWarsObj instanceof Films) {
            preparedStatement = getDeleteFromPreparedStatement((Films) starWarsObj, conn);
        } else if (starWarsObj instanceof Planets) {
            preparedStatement = getDeleteFromPreparedStatement((Planets) starWarsObj, conn);
        } else if (starWarsObj instanceof Species) {
            preparedStatement = getDeleteFromPreparedStatement((Species) starWarsObj, conn);
        } else if (starWarsObj instanceof Starships) {
            preparedStatement = getDeleteFromPreparedStatement((Starships) starWarsObj, conn);
        } else if (starWarsObj instanceof Vehicles) {
            preparedStatement = getDeleteFromPreparedStatement((Vehicles) starWarsObj, conn);
        } else throw new SQLException("Invalid Object");
        return preparedStatement;
    }
    
    public static PreparedStatement getDeleteFromPreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people WHERE peopleid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPreparedStatement(Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people WHERE peopleid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPreparedStatement(Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM species WHERE speciesid = ?");
        preparedStatement.setInt(1, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM starships WHERE starshipsid = ?");
        preparedStatement.setInt(1, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM vehicles WHERE vehiclesid = ?");
        preparedStatement.setInt(1, vehicle.getVehiclesid());
        return preparedStatement;
    }
}
