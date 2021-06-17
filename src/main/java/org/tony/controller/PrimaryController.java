package org.tony.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import org.tony.db.DbConnection;
import org.tony.model.*;

import java.io.File;
import java.io.IOException;

public class PrimaryController {


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
    File[] listOfFiles;

    @FXML
    private RadioButton films;

    @FXML
    private ToggleGroup RootAttributes;

    @FXML
    private RadioButton people;

    @FXML
    private RadioButton planets;

    @FXML
    private RadioButton species;

    @FXML
    private RadioButton starships;

    @FXML
    private RadioButton vehicles;

    @FXML
    private TextField search;

    @FXML
    private Button primaryButton;

    @FXML
    void submit(ActionEvent event) throws IOException {

        File[] listOfPeopleFiles = getFiles(PeoplePath);
        File[] listOfFilmsFiles = getFiles(FilmsPath);
        File[] listOfVehiclesFiles = getFiles(VehiclesPath);
        File[] listOfStarshipsFiles = getFiles(StarshipsPath);
        File[] listOfSpeciesFiles = getFiles(SpeciesPath);
        File[] listOfPlanetsFiles = getFiles(PlanetsPath);

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleFilms(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeoplePlanets(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleSpecies(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleStarships(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleVehicles(people);
            }
        }


        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsPlanets(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsSpecies(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsStarships(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsVehicles(films);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoStarWarsApiDb(people);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoStarWarsApiDb(films);
            }
        }

        for(File file: listOfPlanetsFiles) {
            if(!file.getPath().equals(PlanetsDsStoreFile)) {
                Planets planets = getPlanets(file);
                DbConnection.insertIntoStarWarsApiDb(planets);
            }
        }

        for(File file: listOfSpeciesFiles) {
            if(!file.getPath().equals(SpeciesDsStoreFile)) {
                Species species = getSpecies(file);
                DbConnection.insertIntoStarWarsApiDb(species);
            }
        }


        for(File file: listOfStarshipsFiles) {
            if(!file.getPath().equals(StarshipsDsStoreFile)) {
                Starships starships = getStarships(file);
                DbConnection.insertIntoStarWarsApiDb(starships);
            }
        }


        for(File file: listOfVehiclesFiles) {
            if(!file.getPath().equals(VehiclesDsStoreFile)) {
                Vehicles vehicles = getVehicles(file);
                DbConnection.insertIntoStarWarsApiDb(vehicles);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleFilms(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeoplePlanets(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleSpecies(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleStarships(people);
            }
        }

        for(File file: listOfPeopleFiles) {
            if(!file.getPath().equals(PeopleDsStoreFile)) {
                People people = getPeople(file);
                DbConnection.insertIntoPeopleVehicles(people);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsPlanets(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsSpecies(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsStarships(films);
            }
        }

        for(File file: listOfFilmsFiles) {
            if(!file.getPath().equals(FilmsDsStoreFile)) {
                Films films = getFilms(file);
                DbConnection.insertIntoFilmsVehicles(films);
            }
        }

    }

    private Planets getPlanets(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Planets planets = mapper.readValue(file, Planets.class);
        System.out.println(planets.getUrl());
        planets.setPlanetsid(StarWarsObj.extractIdFromUrl(planets.getUrl()));
        return planets;
    }

    private Species getSpecies(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Species species = mapper.readValue(file, Species.class);
        System.out.println(species.getUrl());
        species.setSpeciesid(StarWarsObj.extractIdFromUrl(species.getUrl()));
        return species;
    }

    private Starships getStarships(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Starships starships = mapper.readValue(file, Starships.class);
        System.out.println(starships.getUrl());
        starships.setStarshipsid(StarWarsObj.extractIdFromUrl(starships.getUrl()));
        return starships;
    }

    private Vehicles getVehicles(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Vehicles vehicles = mapper.readValue(file, Vehicles.class);
        System.out.println(vehicles.getUrl());
        vehicles.setVehiclesid(StarWarsObj.extractIdFromUrl(vehicles.getUrl()));
        return vehicles;
    }

    private Films getFilms(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Films films = mapper.readValue(file, Films.class);
        films.setFilmsid(StarWarsObj.extractIdFromUrl(films.getUrl()));
        return films;
    }

    private People getPeople(File file) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        People people = mapper.readValue(file, People.class);
        people.setPeopleid(StarWarsObj.extractIdFromUrl(people.getUrl()));
        return people;
    }

    private File[] getFiles(String folderPath) {
        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        return listOfFiles;
    }


}
