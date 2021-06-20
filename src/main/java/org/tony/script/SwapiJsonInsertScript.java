package org.tony.script;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.tony.script.model.*;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class SwapiJsonInsertScript {

    private static final String PeoplePath = "src/main/resources/org/tony/jsons/people/";
    private static final String FilmsPath = "src/main/resources/org/tony/jsons/films/";
    private static final String PlanetsPath = "src/main/resources/org/tony/jsons/planets/";
    private static final String SpeciesPath = "src/main/resources/org/tony/jsons/species/";
    private static final String StarshipsPath = "src/main/resources/org/tony/jsons/starships/";
    private static final String VehiclesPath = "src/main/resources/org/tony/jsons/vehicles/";
    private static final String PeopleDsStoreFile = "src/main/resources/org/tony/jsons/people/.DS_Store";
    private static final String FilmsDsStoreFile = "src/main/resources/org/tony/jsons/films/.DS_Store";
    private static final String PlanetsDsStoreFile = "src/main/resources/org/tony/jsons/planets/.DS_Store";
    private static final String SpeciesDsStoreFile = "src/main/resources/org/tony/jsons/species/.DS_Store";
    private static final String StarshipsDsStoreFile = "src/main/resources/org/tony/jsons/starships/.DS_Store";
    private static final String VehiclesDsStoreFile = "src/main/resources/org/tony/jsons/vehicles/.DS_Store";

    private static final File[] PeopleFilesArray = getFilesFromPath(PeoplePath);
    private static final File[] FilmsFilesArray = getFilesFromPath(FilmsPath);
    private static final File[] VehiclesFilesArray = getFilesFromPath(VehiclesPath);
    private static final File[] StarshipsFilesArray = getFilesFromPath(StarshipsPath);
    private static final File[] SpeciesFilesArray = getFilesFromPath(SpeciesPath);
    private static final File[] PlanetsFilesArray = getFilesFromPath(PlanetsPath);

    public static void runScript() throws IOException, ClassNotFoundException {
        for (File file : PeopleFilesArray) {
            if (!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeopleFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : FilmsFilesArray) {
            if (!file.getPath().equals(FilmsDsStoreFile)) {
                Films film = getFilmFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(film);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : PlanetsFilesArray) {
            if (!file.getPath().equals(PlanetsDsStoreFile)) {
                Planets planet = getPlanetFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(planet);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : SpeciesFilesArray) {
            if (!file.getPath().equals(SpeciesDsStoreFile)) {
                Species species = getSpeciesFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(species);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : StarshipsFilesArray) {
            if (!file.getPath().equals(StarshipsDsStoreFile)) {
                Starships starship = getStarshipFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(starship);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : VehiclesFilesArray) {
            if (!file.getPath().equals(VehiclesDsStoreFile)) {
                Vehicles vehicle = getVehicleFromJson(file);
                try {
                    InsertStatements.insertIntoStarWarsApiDb(vehicle);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : PeopleFilesArray) {
            if (!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeopleFromJson(file);
                try {
                    InsertStatements.insertIntoPeopleFilmsTable(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoPeoplePlanetsTable(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoPeopleSpeciesTable(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoPeopleStarshipsTable(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoPeopleVehiclesTable(people);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

        for (File file : FilmsFilesArray) {
            if (!file.getPath().equals(FilmsDsStoreFile)) {
                Films film = getFilmFromJson(file);
                try {
                    InsertStatements.insertIntoFilmsPlanetsTable(film);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoFilmsSpeciesTable(film);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoFilmsStarshipsTable(film);
                } catch (SQLException e) {
                    System.out.println(e);
                }
                try {
                    InsertStatements.insertIntoFilmsVehiclesTable(film);
                } catch (SQLException e) {
                    System.out.println(e);
                }
            }
        }

    }

    private static Planets getPlanetFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Planets planets = mapper.readValue(file, Planets.class);
        planets.setPlanetsid(StarWarsObj.extractIdFromUrl(planets.getUrl()));
        return planets;
    }

    private static Species getSpeciesFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Species species = mapper.readValue(file, Species.class);
        species.setSpeciesid(StarWarsObj.extractIdFromUrl(species.getUrl()));
        return species;
    }

    private static Starships getStarshipFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Starships starships = mapper.readValue(file, Starships.class);
        starships.setStarshipsid(StarWarsObj.extractIdFromUrl(starships.getUrl()));
        return starships;
    }

    private static Vehicles getVehicleFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Vehicles vehicles = mapper.readValue(file, Vehicles.class);
        vehicles.setVehiclesid(StarWarsObj.extractIdFromUrl(vehicles.getUrl()));
        return vehicles;
    }

    private static Films getFilmFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Films films = mapper.readValue(file, Films.class);
        films.setFilmsid(StarWarsObj.extractIdFromUrl(films.getUrl()));
        return films;
    }

    private static People getPeopleFromJson(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        People people = mapper.readValue(file, People.class);
        people.setPeopleid(StarWarsObj.extractIdFromUrl(people.getUrl()));
        return people;
    }

    private static File[] getFilesFromPath(String folderPath) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        return listOfFiles;
    }
}

