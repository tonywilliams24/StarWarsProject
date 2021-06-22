package org.tony.db;

import org.tony.model.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateStatements {

    public static void updateTable(StarWarsObj starWarsObj) throws SQLException, ClassNotFoundException {
        Connection conn = DbConnection.createDbConnection();
        PreparedStatement preparedStatement = getUpdatePreparedStatement(starWarsObj, conn);
        preparedStatement.executeUpdate();
    }

    public static PreparedStatement getUpdatePreparedStatement(StarWarsObj starWarsObj, Connection conn) throws SQLException {
        if (starWarsObj instanceof People) {
            return getUpdatePeopleTablePreparedStatement((People) starWarsObj, conn);
        } else if (starWarsObj instanceof Films) {
            return getUpdateFilmsTablePreparedStatement((Films) starWarsObj, conn);
        } else if (starWarsObj instanceof Planets) {
            return getUpdatePlanetsTablePreparedStatement((Planets) starWarsObj, conn);
        } else if (starWarsObj instanceof Species) {
            return getUpdateSpeciesTablePreparedStatement((Species) starWarsObj, conn);
        } else if (starWarsObj instanceof Starships) {
            return getUpdateStarshipsTablePreparedStatement((Starships) starWarsObj, conn);
        } else if (starWarsObj instanceof Vehicles) {
            return getUpdateVehiclesTablePreparedStatement((Vehicles) starWarsObj, conn);
        } else throw new SQLException("Invalid Object");
    }
    
    public static PreparedStatement getUpdatePeopleTablePreparedStatement(People people, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE people SET name=?, height=?, mass=?, hair_color=?, skin_color=?, eye_color=?, birth_year=?, gender=?, created=?, edited=?, url=? WHERE peopleid=?");
        preparedStatement.setString(1, people.getName());
        preparedStatement.setString(2, people.getHeight());
        preparedStatement.setString(3, people.getMass());
        preparedStatement.setString(4, people.getHair_color());
        preparedStatement.setString(5, people.getSkin_color());
        preparedStatement.setString(6, people.getEye_color());
        preparedStatement.setString(7, people.getBirth_year());
        preparedStatement.setString(8, people.getGender());
        preparedStatement.setString(9, people.getCreated());
        preparedStatement.setString(10, people.getEdited());
        preparedStatement.setString(11, String.valueOf(people.getUrl()));
        preparedStatement.setInt(12, people.getPeopleid());
        return preparedStatement;
    }

    public static PreparedStatement getUpdateFilmsTablePreparedStatement(Films film, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE films SET title=?, episode_id=?, opening_crawl=?, director=?, producer=?, release_date=?, created=?, edited=?, url=? WHERE filmsid=?");
        preparedStatement.setString(1, film.getTitle());
        preparedStatement.setInt(2, film.getEpisode_id());
        preparedStatement.setString(3, film.getOpening_crawl());
        preparedStatement.setString(4, film.getDirector());
        preparedStatement.setString(5, film.getProducer());
        preparedStatement.setString(6, film.getRelease_date());
        preparedStatement.setString(7, film.getCreated());
        preparedStatement.setString(8, film.getEdited());
        preparedStatement.setString(9, String.valueOf(film.getUrl()));
        preparedStatement.setInt(10, film.getFilmsid());
        return preparedStatement;
    }

    public static PreparedStatement getUpdatePlanetsTablePreparedStatement(Planets planet, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE planets SET name=?, rotation_period=?, orbital_period=?, diameter=?, climate=?, gravity=?, terrain=?, surface_water=?, population=?, created=?, edited=?, url=? WHERE planetsid=?");
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

    public static PreparedStatement getUpdateSpeciesTablePreparedStatement(Species species, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE species SET name=?, classification=?, designation=?, average_height=?, skin_colors=?, hair_colors=?, eye_colors=?, average_lifespan=?, homeworld=?, language=?, created=?, edited=?, url=? WHERE speciesid=?");
        preparedStatement.setString(1, species.getName());
        preparedStatement.setString(2, species.getClassification());
        preparedStatement.setString(3, species.getDesignation());
        preparedStatement.setString(4, species.getAverage_height());
        preparedStatement.setString(5, species.getSkin_colors());
        preparedStatement.setString(6, species.getHair_colors());
        preparedStatement.setString(7, species.getEye_colors());
        preparedStatement.setString(8, species.getAverage_lifespan());
        preparedStatement.setString(9, species.getHomeworld());
        preparedStatement.setString(10, species.getLanguage());
        preparedStatement.setString(11, species.getCreated());
        preparedStatement.setString(12, species.getEdited());
        preparedStatement.setString(13, String.valueOf(species.getUrl()));
        preparedStatement.setInt(14, species.getSpeciesid());
        return preparedStatement;
    }

    public static PreparedStatement getUpdateStarshipsTablePreparedStatement(Starships starship, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE starships SET name=?, model=?, manufacturer=?, cost_in_credits=?, length=?, max_atmosphering_speed=?, crew=?, passengers=?, cargo_capacity=?, consumables=?, hyperdrive_rating=?, MGLT=?, starship_class=?, created=?, edited=?, url=? WHERE starshipsid=?");
        preparedStatement.setString(1, starship.getName());
        preparedStatement.setString(2, starship.getModel());
        preparedStatement.setString(3, starship.getManufacturer());
        preparedStatement.setString(4, starship.getCost_in_credits());
        preparedStatement.setString(5, starship.getLength());
        preparedStatement.setString(6, starship.getMax_atmosphering_speed());
        preparedStatement.setString(7, starship.getCrew());
        preparedStatement.setString(8, starship.getPassengers());
        preparedStatement.setString(9, starship.getCargo_capacity());
        preparedStatement.setString(10, starship.getConsumables());
        preparedStatement.setString(11, starship.getHyperdrive_rating());
        preparedStatement.setString(12, starship.getMGLT());
        preparedStatement.setString(13, starship.getStarship_class());
        preparedStatement.setString(14, starship.getCreated());
        preparedStatement.setString(15, starship.getEdited());
        preparedStatement.setString(16, String.valueOf(starship.getUrl()));
        preparedStatement.setInt(17, starship.getStarshipsid());
        return preparedStatement;
    }

    public static PreparedStatement getUpdateVehiclesTablePreparedStatement(Vehicles vehicle, Connection conn) throws SQLException {
        PreparedStatement preparedStatement = conn.prepareStatement("UPDATE vehicles SET name=?, model=?, manufacturer=?, cost_in_credits=?, length=?, max_atmosphering_speed=?, crew=?, passengers=?, cargo_capacity=?, consumables=?, vehicle_class=?, created=?, edited=?, url=? WHERE vehiclesid=?");
        preparedStatement.setString(1, vehicle.getName());
        preparedStatement.setString(2, vehicle.getModel());
        preparedStatement.setString(3, vehicle.getManufacturer());
        preparedStatement.setString(4, vehicle.getCost_in_credits());
        preparedStatement.setString(5, vehicle.getLength());
        preparedStatement.setString(6, vehicle.getMax_atmosphering_speed());
        preparedStatement.setString(7, vehicle.getCrew());
        preparedStatement.setString(8, vehicle.getPassengers());
        preparedStatement.setString(9, vehicle.getCargo_capacity());
        preparedStatement.setString(10, vehicle.getConsumables());
        preparedStatement.setString(11, vehicle.getVehicle_class());
        preparedStatement.setString(12, vehicle.getCreated());
        preparedStatement.setString(13, vehicle.getEdited());
        preparedStatement.setString(14, String.valueOf(vehicle.getUrl()));
        preparedStatement.setInt(15, vehicle.getVehiclesid());
        return preparedStatement;
    }
}
