package org.tony.db;

import org.tony.model.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DbConnection {
    private static final String propertiesPath = "src/main/resources/org/tony/db.properties";

    public static Connection createDbConnection() throws SQLException, ClassNotFoundException {
        System.out.println("createdDbConnection started...");
        final Properties properties = getConnectionProperties();
        final String host = properties.getProperty("db.host");
        final String username = properties.getProperty("db.username");
        final String password = properties.getProperty("db.password");
        return DriverManager.getConnection(host, username, password);
    }
    public static Properties getConnectionProperties() {
        System.out.println("getConnectionData started...");
        Properties properties = new Properties();
        try(FileInputStream in = new FileInputStream(propertiesPath)) {
            properties.load(in);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static void getAllTables() {
        System.out.println("getAllTables started...");
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

    public static int insertIntoStarWarsApiDb(StarWarsObj starWarsObj) {
        int newTableRow = -1;
        try (Connection conn = createDbConnection()) {
            if (starWarsObj instanceof People) {
                newTableRow = getInsertIntoPreparedStatement((People)starWarsObj, conn).executeUpdate();
            }
            else if (starWarsObj instanceof Films) {
                newTableRow = getInsertIntoPreparedStatement((Films)starWarsObj, conn).executeUpdate();
            }
            else if (starWarsObj instanceof Planets) {
                newTableRow = getInsertIntoPreparedStatement((Planets)starWarsObj, conn).executeUpdate();
            }
            else if (starWarsObj instanceof Species) {
                newTableRow = getInsertIntoPreparedStatement((Species)starWarsObj, conn).executeUpdate();
            }
            else if (starWarsObj instanceof Starships) {
                newTableRow = getInsertIntoPreparedStatement((Starships)starWarsObj, conn).executeUpdate();
            }
            else if (starWarsObj instanceof Vehicles) {
                newTableRow = getInsertIntoPreparedStatement((Vehicles)starWarsObj, conn).executeUpdate();
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return newTableRow;
    }

    public static int insertIntoPeopleFilms(People people) {
        int newTableRow = -1;
        int peopleid = people.getPeopleid();
        for (URL filmUrl : people.getFilms()) {
            int filmsid = extractIdFromUrl(filmUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleFilmsPreparedStatement(peopleid, filmsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleFilms(Films film) {
        int newTableRow = -1;
        int filmsid = film.getFilmsid();
        for (URL peopleUrl : film.getCharacters()) {
            int peopleid = extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleFilmsPreparedStatement(peopleid, filmsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeoplePlanets(People people) {
        int newTableRow = -1;
        int peopleid = people.getPeopleid();
        int planetsid = extractIdFromUrl(people.getHomeworld());
        try (Connection conn = createDbConnection()) {
            newTableRow = getInsertIntoPeoplePlanetsPreparedStatement(peopleid, planetsid, conn).executeUpdate();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
        return newTableRow;
    }

    public static int insertIntoPeoplePlanets(Planets planet) {
        int newTableRow = -1;
        int planetsid = planet.getPlanetsid();
        for (URL peopleUrl : planet.getResidents()) {
            int peopleid = extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeoplePlanetsPreparedStatement(peopleid, planetsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleSpecies(People people) {
        int newTableRow = -1;
        int peopleid = people.getPeopleid();
        for (URL speciesUrl : people.getSpecies()) {
            int speciesid = extractIdFromUrl(speciesUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleSpecies(Species Species) {
        int newTableRow = -1;
        int speciesid = Species.getSpeciesid();
        for (URL peopleUrl : Species.getPeople()) {
            int peopleid = extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsPlanets(Films films) {
        int newTableRow = -1;
        int filmsid = films.getFilmsid();
        for (URL planetsUrl : films.getPlanets()) {
            int planetsid = extractIdFromUrl(planetsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsPlanetsPreparedStatement(filmsid, planetsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsPlanets(Planets planet) {
        int newTableRow = -1;
        int planetsid = planet.getPlanetsid();
        for (URL filmsUrl : planet.getResidents()) {
            int filmsid = extractIdFromUrl(filmsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsPlanetsPreparedStatement(filmsid, planetsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsSpecies(Films films) {
        int newTableRow = -1;
        int filmsid = films.getFilmsid();
        for (URL speciesUrl : films.getSpecies()) {
            int speciesid = extractIdFromUrl(speciesUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsSpeciesPreparedStatement(filmsid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsSpecies(Species Species) {
        int newTableRow = -1;
        int speciesid = Species.getSpeciesid();
        for (URL filmsUrl : Species.getFilms()) {
            int filmsid = extractIdFromUrl(filmsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsSpeciesPreparedStatement(filmsid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    private static PreparedStatement getInsertIntoPeopleFilmsPreparedStatement(int peopleid, int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_films(peopleid, filmsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, filmsid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPeoplePlanetsPreparedStatement(int peopleid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_planets(peopleid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPeopleSpeciesPreparedStatement(int peopleid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_species(peopleid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPeopleStarshipsPreparedStatement(int peopleid, int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_starships(peopleid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPeopleVehiclesPreparedStatement(int peopleid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_vehicles(peopleid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoFilmsPlanetsPreparedStatement(int filmsid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_planets(filmsid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoFilmsSpeciesPreparedStatement(int filmsid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_species(filmsid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoFilmsStarshipsPreparedStatement(int filmsid, int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_starships(filmsid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoFilmsVehiclesPreparedStatement(int filmsid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_vehicles(filmsid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }

    private static int extractIdFromUrl(URL url) {
        Pattern idPattern = Pattern.compile("\\d+");
        Matcher idMatch = idPattern.matcher(String.valueOf(url));
        return Integer.parseInt(idMatch.group(0));
    }

    private static PreparedStatement getInsertIntoPreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people(peopleid, name, height, mass, hair_color, skin_color, eye_color, birth_year, gender, homeworld, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setString(2, people.getName());
        preparedStatement.setInt(3, people.getHeight());
        preparedStatement.setInt(4, people.getMass());
        preparedStatement.setString(5, people.getHair_color());
        preparedStatement.setString(6, people.getSkin_color());
        preparedStatement.setString(7, people.getEye_color());
        preparedStatement.setString(8, people.getBirth_year());
        preparedStatement.setString(9, people.getGender());
        preparedStatement.setURL(10, people.getHomeworld());
        preparedStatement.setString(11, people.getCreated());
        preparedStatement.setString(12, people.getEdited());
        preparedStatement.setString(13, String.valueOf(people.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films (filmsid, title, episode_id, opening_crawl, director, producer, release_date, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setString(2,film.getTitle());
        preparedStatement.setInt(3, film.getEpisode_id());
        preparedStatement.setString(4,film.getOpening_crawl());
        preparedStatement.setString(5,film.getDirector());
        preparedStatement.setString(6,film.getProducer());
        preparedStatement.setString(7,film.getRelease_date());
        preparedStatement.setString(8,film.getCreated());
        preparedStatement.setString(9,film.getEdited());
        preparedStatement.setString(10, String.valueOf(film.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO planets (planetsid, name, rotational_period, orbital_period, diameter, climate, gravity, terrain, surface_water, population, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, planet.getPlanetsid());
        preparedStatement.setString(2,planet.getName());
        preparedStatement.setInt(3, planet.getRotational_period());
        preparedStatement.setInt(4,planet.getOrbital_period());
        preparedStatement.setInt(5,planet.getDiameter());
        preparedStatement.setString(6,planet.getClimate());
        preparedStatement.setString(7,planet.getGravity());
        preparedStatement.setString(8,planet.getTerrain());
        preparedStatement.setInt(9,planet.getSurface_water());
        preparedStatement.setLong(10,planet.getPopulation());
        preparedStatement.setString(11,planet.getCreated());
        preparedStatement.setString(12,planet.getEdited());
        preparedStatement.setString(13, String.valueOf(planet.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO species(speciesid, name, designation, average_height, skin_colors, hair_colors, eye_colors, average_lifespan, homeworld, language, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, species.getSpeciesid());
        preparedStatement.setString(2, species.getName());
        preparedStatement.setString(3, species.getDesignation());
        preparedStatement.setInt(4, species.getAverage_height());
        preparedStatement.setString(5, species.getSkin_colors());
        preparedStatement.setString(6, species.getHair_colors());
        preparedStatement.setString(7, species.getEye_colors());
        preparedStatement.setInt(8, species.getAverage_lifespan());
        preparedStatement.setString(9, species.getHomeworld());
        preparedStatement.setString(10, species.getLanguage());
        preparedStatement.setString(11, species.getCreated());
        preparedStatement.setString(12, species.getEdited());
        preparedStatement.setString(13, String.valueOf(species.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO starships (starshipsid, name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, cargo_capacity, consumables, hyperdrive_rating, MGLT, starship_class, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, starship.getStarshipsid());
        preparedStatement.setString(2,starship.getName());
        preparedStatement.setString(3, starship.getModel());
        preparedStatement.setString(4,starship.getManufacturer());
        preparedStatement.setLong(5,starship.getCost_in_credits());
        preparedStatement.setInt(6,starship.getLength());
        preparedStatement.setInt(7,starship.getMax_atmosphering_speed());
        preparedStatement.setInt(8,starship.getCrew());
        preparedStatement.setInt(9,starship.getPassengers());
        preparedStatement.setLong(10,starship.getCargo_capacity());
        preparedStatement.setString(11,starship.getConsumables());
        preparedStatement.setFloat(12,starship.getHyperdrive_rating());
        preparedStatement.setInt(13,starship.getMGLT());
        preparedStatement.setString(14,starship.getStarship_class());
        preparedStatement.setString(15,starship.getCreated());
        preparedStatement.setString(16,starship.getEdited());
        preparedStatement.setString(17, String.valueOf(starship.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO vehicles (vehiclesid, name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, cargo_capacity, consumables, vehicle_class, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, vehicle.getVehiclesid());
        preparedStatement.setString(2,vehicle.getName());
        preparedStatement.setString(3, vehicle.getModel());
        preparedStatement.setString(4,vehicle.getManufacturer());
        preparedStatement.setLong(5,vehicle.getCost_in_credits());
        preparedStatement.setFloat(6,vehicle.getLength());
        preparedStatement.setInt(7,vehicle.getMax_atmosphering_speed());
        preparedStatement.setInt(8,vehicle.getCrew());
        preparedStatement.setInt(9,vehicle.getPassengers());
        preparedStatement.setLong(10,vehicle.getCargo_capacity());
        preparedStatement.setString(11,vehicle.getConsumables());
        preparedStatement.setString(12,vehicle.getVehicle_class());
        preparedStatement.setString(13,vehicle.getCreated());
        preparedStatement.setString(14,vehicle.getEdited());
        preparedStatement.setString(15, String.valueOf(vehicle.getUrl()));
        return preparedStatement;
    }

}
