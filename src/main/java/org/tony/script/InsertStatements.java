package org.tony.script;

import org.tony.db.DbConnection;
import org.tony.script.model.*;

import java.net.URL;
import java.sql.*;

public class InsertStatements {

    protected static void insertIntoStarWarsApiDb(StarWarsObj starWarsObj) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getInsertIntoPreparedStatement(starWarsObj, conn);
        preparedStatement.executeUpdate();
    }

    protected static void insertIntoPeopleFilmsTable(People people) throws SQLException, ClassNotFoundException {
        int peopleid = people.getPeopleid();
        for (URL filmUrl : people.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleFilmsPreparedStatement(peopleid, filmsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleFilmsTable(Films film) throws SQLException, ClassNotFoundException {
        int filmsid = film.getFilmsid();
        for (URL peopleUrl : film.getCharacters()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleFilmsPreparedStatement(peopleid, filmsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeoplePlanetsTable(People people) throws SQLException, ClassNotFoundException {
        int peopleid = people.getPeopleid();
        URL homeworldURL = people.getHomeworld();
        int planetsid = StarWarsObj.extractIdFromUrl(homeworldURL);
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getInsertIntoPeoplePlanetsPreparedStatement(peopleid, planetsid, conn);
        preparedStatement.executeUpdate();
    }

    protected static void insertIntoPeoplePlanetsTable(Planets planet) throws SQLException, ClassNotFoundException {
        int planetsid = planet.getPlanetsid();
        for (URL peopleUrl : planet.getResidents()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeoplePlanetsPreparedStatement(peopleid, planetsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleSpeciesTable(People people) throws SQLException, ClassNotFoundException {
        int peopleid = people.getPeopleid();
        for (URL speciesUrl : people.getSpecies()) {
            int speciesid = StarWarsObj.extractIdFromUrl(speciesUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleSpeciesTable(Species species) throws SQLException, ClassNotFoundException {
        int speciesid = species.getSpeciesid();
        for (URL peopleUrl : species.getPeople()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleSpeciesPreparedStatement(peopleid, speciesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleStarshipsTable(People people) throws SQLException, ClassNotFoundException {
        int peopleid = people.getPeopleid();
        for (URL starshipsUrl : people.getStarships()) {
            int starshipsid = StarWarsObj.extractIdFromUrl(starshipsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleStarshipsPreparedStatement(peopleid, starshipsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleStarshipsTable(Starships starship) throws SQLException, ClassNotFoundException {
        int starshipsid = starship.getStarshipsid();
        for (URL peopleUrl : starship.getPilots()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleStarshipsPreparedStatement(peopleid, starshipsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleVehiclesTable(People people) throws SQLException, ClassNotFoundException {
        int peopleid = people.getPeopleid();
        for (URL vehiclesUrl : people.getVehicles()) {
            int vehiclesid = StarWarsObj.extractIdFromUrl(vehiclesUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleVehiclesPreparedStatement(peopleid, vehiclesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoPeopleVehiclesTable(Vehicles vehicles) throws SQLException, ClassNotFoundException {
        int vehiclesid = vehicles.getVehiclesid();
        for (URL peopleUrl : vehicles.getPilots()) {
            int peopleid = StarWarsObj.extractIdFromUrl(peopleUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoPeopleVehiclesPreparedStatement(peopleid, vehiclesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsPlanetsTable(Films films) throws SQLException, ClassNotFoundException {
        int filmsid = films.getFilmsid();
        for (URL planetsUrl : films.getPlanets()) {
            int planetsid = StarWarsObj.extractIdFromUrl(planetsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsPlanetsPreparedStatement(filmsid, planetsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsPlanetsTable(Planets planet) throws SQLException, ClassNotFoundException {
        int planetsid = planet.getPlanetsid();
        for (URL filmsUrl : planet.getResidents()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsPlanetsPreparedStatement(filmsid, planetsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoSpeciesPlanetsTable(Species species) throws SQLException, ClassNotFoundException {
        int speciesid = species.getSpeciesid();
        URL homeworldURL = species.getHomeworld();
        System.out.println(speciesid);
        System.out.println(homeworldURL);
        if(homeworldURL!=null) {
            int planetsid = StarWarsObj.extractIdFromUrl(homeworldURL);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoSpeciesPlanetsPreparedStatement(speciesid, planetsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoSpeciesPlanetsTable(Planets planet) throws SQLException, ClassNotFoundException {
        int planetsid = planet.getPlanetsid();
        for (URL speciesUrl : planet.getResidents()) {
            int speciesid = StarWarsObj.extractIdFromUrl(speciesUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoSpeciesPlanetsPreparedStatement(speciesid, planetsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsSpeciesTable(Films films) throws SQLException, ClassNotFoundException {
        int filmsid = films.getFilmsid();
        for (URL speciesUrl : films.getSpecies()) {
            int speciesid = StarWarsObj.extractIdFromUrl(speciesUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsSpeciesPreparedStatement(filmsid, speciesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsSpeciesTable(Species Species) throws SQLException, ClassNotFoundException {
        int speciesid = Species.getSpeciesid();
        for (URL filmsUrl : Species.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsSpeciesPreparedStatement(filmsid, speciesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsStarshipsTable(Films films) throws SQLException, ClassNotFoundException {
        int filmsid = films.getFilmsid();
        for (URL starshipsUrl : films.getStarships()) {
            int starshipsid = StarWarsObj.extractIdFromUrl(starshipsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsStarshipsPreparedStatement(filmsid, starshipsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsStarshipsTable(Starships starships) throws SQLException, ClassNotFoundException {
        int starshipsid = starships.getStarshipsid();
        for (URL filmsUrl : starships.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsStarshipsPreparedStatement(filmsid, starshipsid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsVehiclesTable(Films films) throws SQLException, ClassNotFoundException {
        int filmsid = films.getFilmsid();
        for (URL vehiclesUrl : films.getVehicles()) {
            int vehiclesid = StarWarsObj.extractIdFromUrl(vehiclesUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsVehiclesPreparedStatement(filmsid, vehiclesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static void insertIntoFilmsVehiclesTable(Vehicles vehicles) throws SQLException, ClassNotFoundException {
        int vehiclesid = vehicles.getVehiclesid();
        for (URL filmsUrl : vehicles.getFilms()) {
            int filmsid = StarWarsObj.extractIdFromUrl(filmsUrl);
            Connection conn = DbConnection.createDbConnection();
            PreparedStatement preparedStatement = getInsertIntoFilmsVehiclesPreparedStatement(filmsid, vehiclesid, conn);
            preparedStatement.executeUpdate();
        }
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(StarWarsObj starWarsObj, Connection conn) throws SQLException {
        PreparedStatement preparedStatement;
        if (starWarsObj instanceof People) {
            preparedStatement = getInsertIntoPreparedStatement((People) starWarsObj, conn);
        } else if (starWarsObj instanceof Films) {
            preparedStatement = getInsertIntoPreparedStatement((Films) starWarsObj, conn);
        } else if (starWarsObj instanceof Planets) {
            preparedStatement = getInsertIntoPreparedStatement((Planets) starWarsObj, conn);
        } else if (starWarsObj instanceof Species) {
            preparedStatement = getInsertIntoPreparedStatement((Species) starWarsObj, conn);
        } else if (starWarsObj instanceof Starships) {
            preparedStatement = getInsertIntoPreparedStatement((Starships) starWarsObj, conn);
        } else if (starWarsObj instanceof Vehicles) {
            preparedStatement = getInsertIntoPreparedStatement((Vehicles) starWarsObj, conn);
        } else throw new SQLException("Invalid Object");
        return preparedStatement;
    }
    protected static PreparedStatement getInsertIntoPreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people(peopleid, name, height, mass, hair_color, skin_color, eye_color, birth_year, gender, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setString(2, people.getName());
        preparedStatement.setString(3, people.getHeight());
        preparedStatement.setString(4, people.getMass());
        preparedStatement.setString(5, people.getHair_color());
        preparedStatement.setString(6, people.getSkin_color());
        preparedStatement.setString(7, people.getEye_color());
        preparedStatement.setString(8, people.getBirth_year());
        preparedStatement.setString(9, people.getGender());
        preparedStatement.setString(10, people.getCreated());
        preparedStatement.setString(11, people.getEdited());
        preparedStatement.setString(12, String.valueOf(people.getUrl()));
        return preparedStatement;
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films (filmsid, title, episode_id, opening_crawl, director, producer, release_date, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setString(2, film.getTitle());
        preparedStatement.setInt(3, film.getEpisode_id());
        preparedStatement.setString(4, film.getOpening_crawl());
        preparedStatement.setString(5, film.getDirector());
        preparedStatement.setString(6, film.getProducer());
        preparedStatement.setString(7, film.getRelease_date());
        preparedStatement.setString(8, film.getCreated());
        preparedStatement.setString(9, film.getEdited());
        preparedStatement.setString(10, String.valueOf(film.getUrl()));
        return preparedStatement;
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO planets (planetsid, name, rotation_period, orbital_period, diameter, climate, gravity, terrain, surface_water, population, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, planet.getPlanetsid());
        preparedStatement.setString(2, planet.getName());
        preparedStatement.setString(3, planet.getRotation_period());
        preparedStatement.setString(4, planet.getOrbital_period());
        preparedStatement.setString(5, planet.getDiameter());
        preparedStatement.setString(6, planet.getClimate());
        preparedStatement.setString(7, planet.getGravity());
        preparedStatement.setString(8, planet.getTerrain());
        preparedStatement.setString(9, planet.getSurface_water());
        preparedStatement.setString(10, planet.getPopulation());
        preparedStatement.setString(11, planet.getCreated());
        preparedStatement.setString(12, planet.getEdited());
        preparedStatement.setString(13, String.valueOf(planet.getUrl()));
        return preparedStatement;
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO species(speciesid, name, classification, designation, average_height, skin_colors, hair_colors, eye_colors, average_lifespan, language, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, species.getSpeciesid());
        preparedStatement.setString(2, species.getName());
        preparedStatement.setString(3, species.getClassification());
        preparedStatement.setString(4, species.getDesignation());
        preparedStatement.setString(5, species.getAverage_height());
        preparedStatement.setString(6, species.getSkin_colors());
        preparedStatement.setString(7, species.getHair_colors());
        preparedStatement.setString(8, species.getEye_colors());
        preparedStatement.setString(9, species.getAverage_lifespan());
        preparedStatement.setString(10, species.getLanguage());
        preparedStatement.setString(11, species.getCreated());
        preparedStatement.setString(12, species.getEdited());
        preparedStatement.setString(13, String.valueOf(species.getUrl()));
        return preparedStatement;
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO starships (starshipsid, name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, cargo_capacity, consumables, hyperdrive_rating, MGLT, starship_class, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, starship.getStarshipsid());
        preparedStatement.setString(2, starship.getName());
        preparedStatement.setString(3, starship.getModel());
        preparedStatement.setString(4, starship.getManufacturer());
        preparedStatement.setString(5, starship.getCost_in_credits());
        preparedStatement.setString(6, starship.getLength());
        preparedStatement.setString(7, starship.getMax_atmosphering_speed());
        preparedStatement.setString(8, starship.getCrew());
        preparedStatement.setString(9, starship.getPassengers());
        preparedStatement.setString(10, starship.getCargo_capacity());
        preparedStatement.setString(11, starship.getConsumables());
        preparedStatement.setString(12, starship.getHyperdrive_rating());
        preparedStatement.setString(13, starship.getMGLT());
        preparedStatement.setString(14, starship.getStarship_class());
        preparedStatement.setString(15, starship.getCreated());
        preparedStatement.setString(16, starship.getEdited());
        preparedStatement.setString(17, String.valueOf(starship.getUrl()));
        return preparedStatement;
    }

    protected static PreparedStatement getInsertIntoPreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO vehicles (vehiclesid, name, model, manufacturer, cost_in_credits, length, max_atmosphering_speed, crew, passengers, cargo_capacity, consumables, vehicle_class, created, edited, url) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        preparedStatement.setInt(1, vehicle.getVehiclesid());
        preparedStatement.setString(2, vehicle.getName());
        preparedStatement.setString(3, vehicle.getModel());
        preparedStatement.setString(4, vehicle.getManufacturer());
        preparedStatement.setString(5, vehicle.getCost_in_credits());
        preparedStatement.setString(6, vehicle.getLength());
        preparedStatement.setString(7, vehicle.getMax_atmosphering_speed());
        preparedStatement.setString(8, vehicle.getCrew());
        preparedStatement.setString(9, vehicle.getPassengers());
        preparedStatement.setString(10, vehicle.getCargo_capacity());
        preparedStatement.setString(11, vehicle.getConsumables());
        preparedStatement.setString(12, vehicle.getVehicle_class());
        preparedStatement.setString(13, vehicle.getCreated());
        preparedStatement.setString(14, vehicle.getEdited());
        preparedStatement.setString(15, String.valueOf(vehicle.getUrl()));
        return preparedStatement;
    }
        public static PreparedStatement getInsertIntoPeopleFilmsPreparedStatement(int peopleid, int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_films(peopleid, filmsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeoplePlanetsPreparedStatement(int peopleid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_planets(peopleid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleSpeciesPreparedStatement(int peopleid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_species(peopleid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleStarshipsPreparedStatement(int peopleid, int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_starships(peopleid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleVehiclesPreparedStatement(int peopleid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_vehicles(peopleid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsPlanetsPreparedStatement(int filmsid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_planets(filmsid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoSpeciesPlanetsPreparedStatement(int speciesid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO species_planets(speciesid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, speciesid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsSpeciesPreparedStatement(int filmsid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_species(filmsid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsStarshipsPreparedStatement(int filmsid, int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_starships(filmsid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsVehiclesPreparedStatement(int filmsid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_vehicles(filmsid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }
}