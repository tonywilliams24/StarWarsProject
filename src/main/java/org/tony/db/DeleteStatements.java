package org.tony.db;

import org.tony.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStatements {
    
    public static void deleteFromStarWarsApiDb(StarWarsObj starWarsObj) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getDeleteFromPreparedStatement(starWarsObj, conn);
        preparedStatement.executeUpdate();
    }

    public static PreparedStatement getDeleteFromPreparedStatement(StarWarsObj starWarsObj, Connection conn) throws SQLException {
        if (starWarsObj instanceof People) {
            return getDeleteFromPeopleTablePreparedStatement((People) starWarsObj, conn);
        } else if (starWarsObj instanceof Films) {
            return getDeleteFromFilmsTablePreparedStatement((Films) starWarsObj, conn);
        } else if (starWarsObj instanceof Planets) {
            return getDeleteFromPlanetsTablePreparedStatement((Planets) starWarsObj, conn);
        } else if (starWarsObj instanceof Species) {
            return getDeleteFromSpeciesTablePreparedStatement((Species) starWarsObj, conn);
        } else if (starWarsObj instanceof Starships) {
            return getDeleteFromStarshipsTablePreparedStatement((Starships) starWarsObj, conn);
        } else if (starWarsObj instanceof Vehicles) {
            return getDeleteFromVehiclesTablePreparedStatement((Vehicles) starWarsObj, conn);
        } else throw new SQLException("Invalid Object");
    }

    private static PreparedStatement getDeleteFromPreparedStatement(StarWarsObj starWarsObj0, StarWarsObj starWarsObj1, Connection conn) throws SQLException {
        if (starWarsObj0 instanceof People && starWarsObj1 instanceof Films) {
            return getDeleteFromPeopleFilmsTablePreparedStatement((People) starWarsObj0, (Films) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Planets) {
            return getDeleteFromPeoplePlanetsTablePreparedStatement((People) starWarsObj0, (Planets) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Species) {
            return getDeleteFromPeopleSpeciesTablePreparedStatement((People) starWarsObj0, (Species) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Starships) {
            return getDeleteFromPeopleStarshipsTablePreparedStatement((People) starWarsObj0, (Starships) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof People && starWarsObj1 instanceof Vehicles) {
            return getDeleteFromPeopleVehiclesTablePreparedStatement((People) starWarsObj0, (Vehicles) starWarsObj1, conn);

        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof People) {
            return getDeleteFromPeopleFilmsTablePreparedStatement((People) starWarsObj1, (Films) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Planets) {
            return getDeleteFromFilmsPlanetsTablePreparedStatement((Films) starWarsObj0, (Planets) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Species) {
            return getDeleteFromFilmsSpeciesTablePreparedStatement((Films) starWarsObj0, (Species) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Starships) {
            return getDeleteFromFilmsStarshipsTablePreparedStatement((Films) starWarsObj0, (Starships) starWarsObj1, conn);
        } else if (starWarsObj0 instanceof Films && starWarsObj1 instanceof Vehicles) {
            return getDeleteFromFilmsVehiclesTablePreparedStatement((Films) starWarsObj0, (Vehicles) starWarsObj1, conn);

        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof Planets) {
            return getDeleteFromSpeciesPlanetsTablePreparedStatement((Species) starWarsObj0, (Planets) starWarsObj1, conn);


        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof People) {
            return getDeleteFromPeoplePlanetsTablePreparedStatement((People) starWarsObj1, (Planets) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof Films) {
            return getDeleteFromFilmsPlanetsTablePreparedStatement((Films) starWarsObj1, (Planets) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Planets && starWarsObj1 instanceof Species) {
            return getDeleteFromSpeciesPlanetsTablePreparedStatement((Species) starWarsObj1, (Planets) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof People) {
            return getDeleteFromPeopleSpeciesTablePreparedStatement((People) starWarsObj1, (Species) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Species && starWarsObj1 instanceof Films) {
            return getDeleteFromFilmsSpeciesTablePreparedStatement((Films) starWarsObj1, (Species) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Starships && starWarsObj1 instanceof People) {
            return getDeleteFromPeopleStarshipsTablePreparedStatement((People) starWarsObj1, (Starships) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Starships && starWarsObj1 instanceof Films) {
            return getDeleteFromFilmsStarshipsTablePreparedStatement((Films) starWarsObj1, (Starships) starWarsObj0, conn);

        } else if (starWarsObj0 instanceof Vehicles && starWarsObj1 instanceof People) {
            return getDeleteFromPeopleVehiclesTablePreparedStatement((People) starWarsObj1, (Vehicles) starWarsObj0, conn);
        } else if (starWarsObj0 instanceof Vehicles && starWarsObj1 instanceof Films) {
            return getDeleteFromFilmsVehiclesTablePreparedStatement((Films) starWarsObj1, (Vehicles) starWarsObj0, conn);

        } else throw new SQLException("Invalid Object");

    }
    
    public static PreparedStatement getDeleteFromPeopleTablePreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people WHERE peopleid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromFilmsTablePreparedStatement(Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people WHERE peopleid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPlanetsTablePreparedStatement(Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM planets WHERE planetsid = ?");
        preparedStatement.setInt(1, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromSpeciesTablePreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM species WHERE speciesid = ?");
        preparedStatement.setInt(1, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromStarshipsTablePreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM starships WHERE starshipsid = ?");
        preparedStatement.setInt(1, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromVehiclesTablePreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM vehicles WHERE vehiclesid = ?");
        preparedStatement.setInt(1, vehicle.getVehiclesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPeopleFilmsTablePreparedStatement(People people, Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people_films WHERE peopleid = ? AND filmsid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, film.getFilmsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPeoplePlanetsTablePreparedStatement(People people, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people_planets WHERE peopleid = ? AND planetsid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPeopleSpeciesTablePreparedStatement(People people, Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people_species WHERE peopleid = ? AND speciesid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPeopleStarshipsTablePreparedStatement(People people, Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people_starships WHERE peopleid = ? AND starshipsid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromPeopleVehiclesTablePreparedStatement(People people, Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM people_vehicles WHERE peopleid = ? AND vehiclesid = ?");
        preparedStatement.setInt(1, people.getPeopleid());
        preparedStatement.setInt(2, vehicle.getVehiclesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromFilmsPlanetsTablePreparedStatement(Films film, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM films_planets WHERE filmsid = ? AND planetsid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromFilmsSpeciesTablePreparedStatement(Films film, Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM films_species WHERE filmsid = ? AND speciesid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromFilmsStarshipsTablePreparedStatement(Films film, Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM films_starships WHERE filmsid = ? AND starshipsid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromFilmsVehiclesTablePreparedStatement(Films film, Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM films_vehicles WHERE filmsid = ? AND vehiclesid = ?");
        preparedStatement.setInt(1, film.getFilmsid());
        preparedStatement.setInt(2, vehicle.getVehiclesid());
        return preparedStatement;
    }

    public static PreparedStatement getDeleteFromSpeciesPlanetsTablePreparedStatement(Species species, Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("DELETE FROM species_planets WHERE speciesid = ? AND planetsid = ?");
        preparedStatement.setInt(1, species.getSpeciesid());
        preparedStatement.setInt(2, planet.getPlanetsid());
        return preparedStatement;
    }
}
