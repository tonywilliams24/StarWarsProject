package org.tony.db;

import org.tony.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectStatements {

    public static ResultSet selectPeopleByID(int peopleId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleByIdPreparedStatement(peopleId, conn);
        return preparedStatement.executeQuery();
    }
    
    public static ResultSet selectPeopleByName(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleByNamePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeople() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeoplePreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsByID(int filmsId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsByIdPreparedStatement(filmsId, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsByTitle(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsByTitlePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllFilms() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllFilmsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPlanetsByID(int planetsId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPlanetsByIdPreparedStatement(planetsId, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPlanetsByName(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPlanetsByNamePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPlanets() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPlanetsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesByID(int speciesId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesByIdPreparedStatement(speciesId, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesByName(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesByNamePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllSpecies() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllSpeciesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectStarshipsByID(int starshipsId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectStarshipsByIdPreparedStatement(starshipsId, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectStarshipsByName(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectStarshipsByNamePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllStarships() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllStarshipsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectVehiclesByID(int vehiclesId) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectVehiclesByIdPreparedStatement(vehiclesId, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectVehiclesByName(String name) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectVehiclesByNamePreparedStatement(name, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllVehicles() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllVehiclesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFilmsFromPeopleFilms(int peopleid, int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFilmsFromPeopleFilmsPreparedStatement(peopleid, filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFromPeopleFilms(int peopleid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFromPeopleFilmsPreparedStatement(peopleid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsFromPeopleFilms(int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsFromPeopleFilmsPreparedStatement(filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeopleFilms() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeopleFilmsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeoplePlanetsFromPeoplePlanets(int peopleid, int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeoplePlanetsFromPeoplePlanetsPreparedStatement(peopleid, planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFromPeoplePlanets(int peopleid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFromPeoplePlanetsPreparedStatement(peopleid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPlanetsFromPeoplePlanets(int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPlanetsFromPeoplePlanetsPreparedStatement(planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeoplePlanets() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeoplePlanetsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleSpeciesFromPeopleSpecies(int peopleid, int speciesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleSpeciesFromPeopleSpeciesPreparedStatement(peopleid, speciesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFromPeopleSpecies(int peopleid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFromPeopleSpeciesPreparedStatement(peopleid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesFromPeopleSpecies(int speciesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesFromPeopleSpeciesPreparedStatement(speciesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeopleSpecies() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeopleSpeciesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleStarshipsFromPeopleStarships(int peopleid, int starshipsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleStarshipsFromPeopleStarshipsPreparedStatement(peopleid, starshipsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFromPeopleStarships(int peopleid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFromPeopleStarshipsPreparedStatement(peopleid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectStarshipsFromPeopleStarships(int starshipsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectStarshipsFromPeopleStarshipsPreparedStatement(starshipsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeopleStarships() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeopleStarshipsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleVehiclesFromPeopleVehicles(int peopleid, int vehiclesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleVehiclesFromPeopleVehiclesPreparedStatement(peopleid, vehiclesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPeopleFromPeopleVehicles(int peopleid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPeopleFromPeopleVehiclesPreparedStatement(peopleid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectVehiclesFromPeopleVehicles(int vehiclesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectVehiclesFromPeopleVehiclesPreparedStatement(vehiclesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllPeopleVehicles() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllPeopleVehiclesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsPlanetsFromFilmsPlanets(int filmsid, int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsPlanetsFromFilmsPlanetsPreparedStatement(filmsid, planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsFromFilmsPlanets(int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsFromFilmsPlanetsPreparedStatement(filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPlanetsFromFilmsPlanets(int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPlanetsFromFilmsPlanetsPreparedStatement(planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllFilmsPlanets() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllFilmsPlanetsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesPlanetsFromSpeciesPlanets(int speciesid, int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesPlanetsFromSpeciesPlanetsPreparedStatement(speciesid, planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesFromSpeciesPlanets(int speciesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesFromSpeciesPlanetsPreparedStatement(speciesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectPlanetsFromSpeciesPlanets(int planetsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectPlanetsFromSpeciesPlanetsPreparedStatement(planetsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllSpeciesPlanets() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllSpeciesPlanetsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsSpeciesFromFilmsSpecies(int filmsid, int speciesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsSpeciesFromFilmsSpeciesPreparedStatement(filmsid, speciesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsFromFilmsSpecies(int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsFromFilmsSpeciesPreparedStatement(filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectSpeciesFromFilmsSpecies(int speciesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectSpeciesFromFilmsSpeciesPreparedStatement(speciesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllFilmsSpecies() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllFilmsSpeciesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsStarshipsFromFilmsStarships(int filmsid, int starshipsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsStarshipsFromFilmsStarshipsPreparedStatement(filmsid, starshipsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsFromFilmsStarships(int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsFromFilmsStarshipsPreparedStatement(filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectStarshipsFromFilmsStarships(int starshipsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectStarshipsFromFilmsStarshipsPreparedStatement(starshipsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllFilmsStarships() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllFilmsStarshipsPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsVehiclesFromFilmsVehicles(int filmsid, int vehiclesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsVehiclesFromFilmsVehiclesPreparedStatement(filmsid, vehiclesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectFilmsFromFilmsVehicles(int filmsid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectFilmsFromFilmsVehiclesPreparedStatement(filmsid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectVehiclesFromFilmsVehicles(int vehiclesid) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectVehiclesFromFilmsVehiclesPreparedStatement(vehiclesid, conn);
        return preparedStatement.executeQuery();
    }

    public static ResultSet selectAllFilmsVehicles() throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getSelectAllFilmsVehiclesPreparedStatement(conn);
        return preparedStatement.executeQuery();
    }
    
    public static PreparedStatement getSelectPeopleByIdPreparedStatement(int peopleid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPeopleByNamePreparedStatement(String name, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people WHERE name = ?");
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeoplePreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people");
    }

    public static PreparedStatement getSelectFilmsByIdPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsByTitlePreparedStatement(String title, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films WHERE title = ?");
        preparedStatement.setString(1, title);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllFilmsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM films");
    }

    public static PreparedStatement getSelectPlanetsByIdPreparedStatement(int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPlanetsByNamePreparedStatement(String name, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM planets WHERE name = ?");
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPlanetsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM planets");
    }

    public static PreparedStatement getSelectSpeciesByIdPreparedStatement(int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM species WHERE speciesid = ?");
        preparedStatement.setInt(1, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectSpeciesByNamePreparedStatement(String name, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM species WHERE name = ?");
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllSpeciesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM species");
    }

    public static PreparedStatement getSelectStarshipsByIdPreparedStatement(int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM starships WHERE starshipsid = ?");
        preparedStatement.setInt(1, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectStarshipsByNamePreparedStatement(String name, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM starships WHERE name = ?");
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllStarshipsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM starships");
    }

    public static PreparedStatement getSelectVehiclesByIdPreparedStatement(int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM vehicles WHERE vehiclesid = ?");
        preparedStatement.setInt(1, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectVehiclesByNamePreparedStatement(String name, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM vehicles WHERE name = ?");
        preparedStatement.setString(1, name);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllVehiclesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM vehicles");
    }

    public static PreparedStatement getSelectPeopleFilmsFromPeopleFilmsPreparedStatement(int peopleid, int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_films WHERE peopleid = ? AND filmsid = ?");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPeopleFromPeopleFilmsPreparedStatement(int peopleid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_films WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsFromPeopleFilmsPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_films WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeopleFilmsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people_films");
    }

    public static PreparedStatement getSelectPeoplePlanetsFromPeoplePlanetsPreparedStatement(int peopleid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_planets WHERE peopleid = ? AND planetsid = ?");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPeopleFromPeoplePlanetsPreparedStatement(int peopleid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_planets WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPlanetsFromPeoplePlanetsPreparedStatement(int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeoplePlanetsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people_planets");
    }

    public static PreparedStatement getSelectPeopleSpeciesFromPeopleSpeciesPreparedStatement(int peopleid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_species WHERE peopleid = ? AND speciesid = ?");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPeopleFromPeopleSpeciesPreparedStatement(int peopleid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_species WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectSpeciesFromPeopleSpeciesPreparedStatement(int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_species WHERE speciesid = ?");
        preparedStatement.setInt(1, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeopleSpeciesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people_species");
    }

    public static PreparedStatement getSelectPeopleStarshipsFromPeopleStarshipsPreparedStatement(int peopleid, int starshipsid, Connection conn) throws SQLException {
    PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_starships WHERE peopleid = ? AND starshipsid = ?");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
}

    public static PreparedStatement getSelectPeopleFromPeopleStarshipsPreparedStatement(int peopleid, Connection conn) throws SQLException {
    PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_starships WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
}

    public static PreparedStatement getSelectStarshipsFromPeopleStarshipsPreparedStatement(int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_starships WHERE starshipsid = ?");
        preparedStatement.setInt(1, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeopleStarshipsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people_starships");
    }

    public static PreparedStatement getSelectPeopleVehiclesFromPeopleVehiclesPreparedStatement(int peopleid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_vehicles WHERE peopleid = ? AND vehiclesid = ?");
        preparedStatement.setInt(1, peopleid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPeopleFromPeopleVehiclesPreparedStatement(int peopleid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_vehicles WHERE peopleid = ?");
        preparedStatement.setInt(1, peopleid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectVehiclesFromPeopleVehiclesPreparedStatement(int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM people_vehicles WHERE vehiclesid = ?");
        preparedStatement.setInt(1, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllPeopleVehiclesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM people_vehicles");
    }

    public static PreparedStatement getSelectFilmsPlanetsFromFilmsPlanetsPreparedStatement(int filmsid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_planets WHERE filmsid = ? AND planetsid = ?");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsFromFilmsPlanetsPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_planets WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPlanetsFromFilmsPlanetsPreparedStatement(int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllFilmsPlanetsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM films_planets");
    }

    public static PreparedStatement getSelectSpeciesPlanetsFromSpeciesPlanetsPreparedStatement(int speciesid, int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM species_planets WHERE speciesid = ? AND planetsid = ?");
        preparedStatement.setInt(1, speciesid);
        preparedStatement.setInt(2, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectSpeciesFromSpeciesPlanetsPreparedStatement(int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM species_planets WHERE speciesid = ?");
        preparedStatement.setInt(1, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectPlanetsFromSpeciesPlanetsPreparedStatement(int planetsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM species_planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planetsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllSpeciesPlanetsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM species_planets");
    }

    public static PreparedStatement getSelectFilmsSpeciesFromFilmsSpeciesPreparedStatement(int filmsid, int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_species WHERE filmsid = ? AND speciesid = ?");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsFromFilmsSpeciesPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_species WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectSpeciesFromFilmsSpeciesPreparedStatement(int speciesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_species WHERE speciesid = ?");
        preparedStatement.setInt(1, speciesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllFilmsSpeciesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM films_species");
    }

    public static PreparedStatement getSelectFilmsStarshipsFromFilmsStarshipsPreparedStatement(int filmsid, int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_starships WHERE filmsid = ? AND starshipsid = ?");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsFromFilmsStarshipsPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_starships WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectStarshipsFromFilmsStarshipsPreparedStatement(int starshipsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_starships WHERE starshipsid = ?");
        preparedStatement.setInt(1, starshipsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllFilmsStarshipsPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM films_starships");
    }

    public static PreparedStatement getSelectFilmsVehiclesFromFilmsVehiclesPreparedStatement(int filmsid, int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_vehicles WHERE filmsid = ? AND vehiclesid = ?");
        preparedStatement.setInt(1, filmsid);
        preparedStatement.setInt(2, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectFilmsFromFilmsVehiclesPreparedStatement(int filmsid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_vehicles WHERE filmsid = ?");
        preparedStatement.setInt(1, filmsid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectVehiclesFromFilmsVehiclesPreparedStatement(int vehiclesid, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("SELECT * FROM films_vehicles WHERE vehiclesid = ?");
        preparedStatement.setInt(1, vehiclesid);
        return preparedStatement;
    }

    public static PreparedStatement getSelectAllFilmsVehiclesPreparedStatement(Connection conn) throws SQLException {
        return conn.prepareStatement("SELECT * FROM films_vehicles");
    }
}
