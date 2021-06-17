package org.tony.db;

import org.tony.model.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;


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
            int filmsid = StarWarsObj.extractIdFromUrl(filmUrl);
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
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
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
        int planetsid = StarWarsObj.extractIdFromUrl(people.getHomeworld());
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
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
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
            int speciesid = StarWarsObj.extractIdFromUrl(speciesUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleSpecies(Species species) {
        int newTableRow = -1;
        int speciesid = species.getSpeciesid();
        for (URL peopleUrl : species.getPeople()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleStarships(People people) {
        int newTableRow = -1;
        int peopleid = people.getPeopleid();
        for (URL starshipsUrl : people.getStarships()) {
            int starshipsid = StarWarsObj.extractIdFromUrl(starshipsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleStarshipsPreparedStatement(peopleid, starshipsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleStarships(Starships starships) {
        int newTableRow = -1;
        int starshipsid = starships.getStarshipsid();
        for (URL peopleUrl : starships.getPilots()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleStarshipsPreparedStatement(peopleid, starshipsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleVehicles(People people) {
        int newTableRow = -1;
        int peopleid = people.getPeopleid();
        for (URL vehiclesUrl : people.getVehicles()) {
            int vehiclesid = StarWarsObj.extractIdFromUrl(vehiclesUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleVehiclesPreparedStatement(peopleid, vehiclesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoPeopleVehicles(Vehicles vehicles) {
        int newTableRow = -1;
        int vehiclesid = vehicles.getVehiclesid();
        for (URL peopleUrl : vehicles.getPilots()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoPeopleVehiclesPreparedStatement(peopleid, vehiclesid, conn).executeUpdate();
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
            int planetsid = StarWarsObj.extractIdFromUrl(planetsUrl);
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
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
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
            int speciesid = StarWarsObj.extractIdFromUrl(speciesUrl);
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
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsSpeciesPreparedStatement(filmsid, speciesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsStarships(Films films) {
        int newTableRow = -1;
        int filmsid = films.getFilmsid();
        for (URL starshipsUrl : films.getStarships()) {
            int starshipsid = StarWarsObj.extractIdFromUrl(starshipsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsStarshipsPreparedStatement(filmsid, starshipsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsStarships(Starships starships) {
        int newTableRow = -1;
        int starshipsid = starships.getStarshipsid();
        for (URL filmsUrl : starships.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsStarshipsPreparedStatement(filmsid, starshipsid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsVehicles(Films films) {
        int newTableRow = -1;
        int filmsid = films.getFilmsid();
        for (URL vehiclesUrl : films.getVehicles()) {
            int vehiclesid = StarWarsObj.extractIdFromUrl(vehiclesUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsVehiclesPreparedStatement(filmsid, vehiclesid, conn).executeUpdate();
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println(e);
            }
        }
        return newTableRow;
    }

    public static int insertIntoFilmsVehicles(Vehicles vehicles) {
        int newTableRow = -1;
        int vehiclesid = vehicles.getVehiclesid();
        for (URL filmsUrl : vehicles.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            try (Connection conn = createDbConnection()) {
                newTableRow = getInsertIntoFilmsVehiclesPreparedStatement(filmsid, vehiclesid, conn).executeUpdate();
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

    private static PreparedStatement getInsertIntoPreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people(peopleid, name, height, mass, hair_color, skin_color, eye_color, birth_year, gender, homeworld, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setString(2, people.getName());
        preparedStatement.setString(3, people.getHeight());
        preparedStatement.setString(4, people.getMass());
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
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO planets (planetsid, name, rotation_period, orbital_period, diameter, climate, gravity, terrain, surface_water, population, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, planet.getPlanetsid());
        preparedStatement.setString(2,planet.getName());
        preparedStatement.setString(3, planet.getRotation_period());
        preparedStatement.setString(4,planet.getOrbital_period());
        preparedStatement.setString(5,planet.getDiameter());
        preparedStatement.setString(6,planet.getClimate());
        preparedStatement.setString(7,planet.getGravity());
        preparedStatement.setString(8,planet.getTerrain());
        preparedStatement.setString(9,planet.getSurface_water());
        preparedStatement.setString(10,planet.getPopulation());
        preparedStatement.setString(11,planet.getCreated());
        preparedStatement.setString(12,planet.getEdited());
        preparedStatement.setString(13, String.valueOf(planet.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO species(speciesid, name, classification, designation, average_height, skin_colors, hair_colors, eye_colors, average_lifespan, homeworld, language, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, species.getSpeciesid());
        preparedStatement.setString(2, species.getName());
        preparedStatement.setString(3, species.getClassification());
        preparedStatement.setString(4, species.getDesignation());
        preparedStatement.setString(5, species.getAverage_height());
        preparedStatement.setString(6, species.getSkin_colors());
        preparedStatement.setString(7, species.getHair_colors());
        preparedStatement.setString(8, species.getEye_colors());
        preparedStatement.setString(9, species.getAverage_lifespan());
        preparedStatement.setString(10, species.getHomeworld());
        preparedStatement.setString(11, species.getLanguage());
        preparedStatement.setString(12, species.getCreated());
        preparedStatement.setString(13, species.getEdited());
        preparedStatement.setString(14, String.valueOf(species.getUrl()));
        return preparedStatement;
    }

    private static PreparedStatement getInsertIntoPreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO starships (starshipsid, name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, cargo_capacity, consumables, hyperdrive_rating, MGLT, starship_class, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, starship.getStarshipsid());
        preparedStatement.setString(2,starship.getName());
        preparedStatement.setString(3, starship.getModel());
        preparedStatement.setString(4,starship.getManufacturer());
        preparedStatement.setString(5,starship.getCost_in_credits());
        preparedStatement.setString(6,starship.getLength());
        preparedStatement.setString(7,starship.getMax_atmosphering_speed());
        preparedStatement.setString(8,starship.getCrew());
        preparedStatement.setString(9,starship.getPassengers());
        preparedStatement.setString(10,starship.getCargo_capacity());
        preparedStatement.setString(11,starship.getConsumables());
        preparedStatement.setString(12,starship.getHyperdrive_rating());
        preparedStatement.setString(13,starship.getMGLT());
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
        preparedStatement.setString(5,vehicle.getCost_in_credits());
        preparedStatement.setString(6,vehicle.getLength());
        preparedStatement.setString(7,vehicle.getMax_atmosphering_speed());
        preparedStatement.setString(8,vehicle.getCrew());
        preparedStatement.setString(9,vehicle.getPassengers());
        preparedStatement.setString(10,vehicle.getCargo_capacity());
        preparedStatement.setString(11,vehicle.getConsumables());
        preparedStatement.setString(12,vehicle.getVehicle_class());
        preparedStatement.setString(13,vehicle.getCreated());
        preparedStatement.setString(14,vehicle.getEdited());
        preparedStatement.setString(15, String.valueOf(vehicle.getUrl()));
        return preparedStatement;
    }

}
