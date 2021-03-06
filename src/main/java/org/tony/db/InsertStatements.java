package org.tony.db;

import org.tony.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertStatements {

    public static void insertIntoTable(StarWarsObj starWarsObj) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getInsertIntoPreparedStatement(starWarsObj, conn);
        preparedStatement.executeUpdate();
    }

    public static void insertIntoTable(StarWarsObj starWarsObj0, StarWarsObj starWarsObj1) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getInsertIntoPreparedStatement(starWarsObj0,starWarsObj1, conn);
        preparedStatement.executeUpdate();
    }

    public static PreparedStatement getInsertIntoPreparedStatement(StarWarsObj starWarsObj, Connection conn) throws SQLException {
        if (starWarsObj instanceof People) {
            return getInsertIntoPeopleTablePreparedStatement((People) starWarsObj, conn);
        } else if (starWarsObj instanceof Films) {
            return getInsertIntoFilmsTablePreparedStatement((Films) starWarsObj, conn);
        } else if (starWarsObj instanceof Planets) {
            return getInsertIntoPlanetsTablePreparedStatement((Planets) starWarsObj, conn);
        } else if (starWarsObj instanceof Species) {
            return getInsertIntoSpeciesTablePreparedStatement((Species) starWarsObj, conn);
        } else if (starWarsObj instanceof Starships) {
            return getInsertIntoStarshipsTablePreparedStatement((Starships) starWarsObj, conn);
        } else if (starWarsObj instanceof Vehicles) {
            return getInsertIntoVehiclesTablePreparedStatement((Vehicles) starWarsObj, conn);
        } else throw new SQLException("Invalid Object");
    }

    private static PreparedStatement getInsertIntoPreparedStatement(StarWarsObj starWarsObj0, StarWarsObj starWarsObj1, Connection conn) throws SQLException {
        if (starWarsObj0 instanceof People && starWarsObj1 instanceof Films) {
            return getInsertIntoPeopleFilmsTablePreparedStatement((People) starWarsObj0, (Films) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Planets) {
                return getInsertIntoPeoplePlanetsTablePreparedStatement((People) starWarsObj0, (Planets) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Species) {
                return getInsertIntoPeopleSpeciesTablePreparedStatement((People) starWarsObj0, (Species) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Starships) {
                return getInsertIntoPeopleStarshipsTablePreparedStatement((People) starWarsObj0, (Starships) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Vehicles) {
                return getInsertIntoPeopleVehiclesTablePreparedStatement((People) starWarsObj0, (Vehicles) starWarsObj1, conn);

        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof People) {
                return getInsertIntoPeopleFilmsTablePreparedStatement((People) starWarsObj1, (Films) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Planets) {
                return getInsertIntoFilmsPlanetsTablePreparedStatement((Films) starWarsObj0, (Planets) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Species) {
                return getInsertIntoFilmsSpeciesTablePreparedStatement((Films) starWarsObj0, (Species) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Starships) {
                return getInsertIntoFilmsStarshipsTablePreparedStatement((Films) starWarsObj0, (Starships) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Vehicles) {
                return getInsertIntoFilmsVehiclesTablePreparedStatement((Films) starWarsObj0, (Vehicles) starWarsObj1, conn);

        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof Planets) {
            return getInsertIntoSpeciesPlanetsTablePreparedStatement((Species) starWarsObj0, (Planets) starWarsObj1, conn);

        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof People) {
                return getInsertIntoPeoplePlanetsTablePreparedStatement((People) starWarsObj1, (Planets) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof Films) {
                return getInsertIntoFilmsPlanetsTablePreparedStatement((Films) starWarsObj1, (Planets) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof Species) {
            return getInsertIntoSpeciesPlanetsTablePreparedStatement((Species) starWarsObj1, (Planets) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof People) {
                return getInsertIntoPeopleSpeciesTablePreparedStatement((People) starWarsObj1, (Species) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof Films) {
                return getInsertIntoFilmsSpeciesTablePreparedStatement((Films) starWarsObj1, (Species) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Starships && starWarsObj1 instanceof People) {
                return getInsertIntoPeopleStarshipsTablePreparedStatement((People) starWarsObj1, (Starships) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Starships && starWarsObj1 instanceof Films) {
                return getInsertIntoFilmsStarshipsTablePreparedStatement((Films) starWarsObj1, (Starships) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Vehicles && starWarsObj1 instanceof People) {
                return getInsertIntoPeopleVehiclesTablePreparedStatement((People) starWarsObj1, (Vehicles) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Vehicles && starWarsObj1 instanceof Films) {
                return getInsertIntoFilmsVehiclesTablePreparedStatement((Films) starWarsObj1, (Vehicles) starWarsObj0, conn);
                
        } else throw new SQLException("Invalid Object");
    }

    public static PreparedStatement getInsertIntoPeopleTablePreparedStatement(People people, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoFilmsTablePreparedStatement(Films film, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoPlanetsTablePreparedStatement(Planets planet, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoSpeciesTablePreparedStatement(Species species, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoStarshipsTablePreparedStatement(Starships starship, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoVehiclesTablePreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
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

    public static PreparedStatement getInsertIntoPeopleFilmsTablePreparedStatement(People people, Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_films(peopleid, filmsid) VALUES (?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, film.getFilmsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeoplePlanetsTablePreparedStatement(People people, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_planets(peopleid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleSpeciesTablePreparedStatement(People people, Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_species(peopleid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleStarshipsTablePreparedStatement(People people, Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_starships(peopleid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoPeopleVehiclesTablePreparedStatement(People people, Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_vehicles(peopleid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, vehicle.getVehiclesid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsPlanetsTablePreparedStatement(Films film, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_planets(filmsid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoSpeciesPlanetsTablePreparedStatement(Species species, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO species_planets(speciesid, planetsid) VALUES (?,?)");
        preparedStatement.setInt(1, species.getSpeciesid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsSpeciesTablePreparedStatement(Films film, Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_species(filmsid, speciesid) VALUES (?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsStarshipsTablePreparedStatement(Films film, Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_starships(filmsid, starshipsid) VALUES (?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getInsertIntoFilmsVehiclesTablePreparedStatement(Films film, Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_vehicles(filmsid, vehiclesid) VALUES (?,?)");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, vehicle.getVehiclesid());
        return preparedStatement;
    }




//    public static PreparedStatement getInsertIntoPeopleFilmsPreparedStatement(int peopleid, int filmsid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_films(peopleid, filmsid) VALUES (?,?)");
//        preparedStatement.setInt(1, peopleid);
//        preparedStatement.setInt(2, filmsid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoPeoplePlanetsPreparedStatement(int peopleid, int planetsid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_planets(peopleid, planetsid) VALUES (?,?)");
//        preparedStatement.setInt(1, peopleid);
//        preparedStatement.setInt(2, planetsid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoPeopleSpeciesPreparedStatement(int peopleid, int speciesid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_species(peopleid, speciesid) VALUES (?,?)");
//        preparedStatement.setInt(1, peopleid);
//        preparedStatement.setInt(2, speciesid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoPeopleStarshipsPreparedStatement(int peopleid, int starshipsid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_starships(peopleid, starshipsid) VALUES (?,?)");
//        preparedStatement.setInt(1, peopleid);
//        preparedStatement.setInt(2, starshipsid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoPeopleVehiclesPreparedStatement(int peopleid, int vehiclesid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO people_vehicles(peopleid, vehiclesid) VALUES (?,?)");
//        preparedStatement.setInt(1, peopleid);
//        preparedStatement.setInt(2, vehiclesid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoFilmsPlanetsPreparedStatement(int filmsid, int planetsid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_planets(filmsid, planetsid) VALUES (?,?)");
//        preparedStatement.setInt(1, filmsid);
//        preparedStatement.setInt(2, planetsid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoFilmsSpeciesPreparedStatement(int filmsid, int speciesid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_species(filmsid, speciesid) VALUES (?,?)");
//        preparedStatement.setInt(1, filmsid);
//        preparedStatement.setInt(2, speciesid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoFilmsStarshipsPreparedStatement(int filmsid, int starshipsid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_starships(filmsid, starshipsid) VALUES (?,?)");
//        preparedStatement.setInt(1, filmsid);
//        preparedStatement.setInt(2, starshipsid);
//        return preparedStatement;
//    }
//
//    public static PreparedStatement getInsertIntoFilmsVehiclesPreparedStatement(int filmsid, int vehiclesid, Connection conn) throws SQLException {
//        PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO films_vehicles(filmsid, vehiclesid) VALUES (?,?)");
//        preparedStatement.setInt(1, filmsid);
//        preparedStatement.setInt(2, vehiclesid);
//        return preparedStatement;
//    }
}