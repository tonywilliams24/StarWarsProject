package org.tony.controller;

import com.google.gson.Gson;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import org.tony.App;
import org.tony.db.DbConnection;
import org.tony.model.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrimaryController {



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
        File folder = new File("src/main/resources/org/tony/jsons/people/");
        File[] listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/people/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                People people = mapper.readValue(f, People.class);
                System.out.println(people.getUrl());
                people.setPeopleid(StarWarsObj.extractIdFromUrl(people.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(people);
            }
        }

        folder = new File("src/main/resources/org/tony/jsons/films/");
        listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/films/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                Films films = mapper.readValue(f, Films.class);
                System.out.println(films.getUrl());
                films.setFilmsid(StarWarsObj.extractIdFromUrl(films.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(films);
            }
        }

        folder = new File("src/main/resources/org/tony/jsons/planets/");
        listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/planets/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                Planets planets = mapper.readValue(f, Planets.class);
                System.out.println(planets.getUrl());
                planets.setPlanetsid(StarWarsObj.extractIdFromUrl(planets.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(planets);
            }
        }

        folder = new File("src/main/resources/org/tony/jsons/species/");
        listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/species/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                Species species = mapper.readValue(f, Species.class);
                System.out.println(species.getUrl());
                species.setSpeciesid(StarWarsObj.extractIdFromUrl(species.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(species);
            }
        }

        folder = new File("src/main/resources/org/tony/jsons/starships/");
        listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/starships/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                Starships starships = mapper.readValue(f, Starships.class);
                System.out.println(starships.getUrl());
                starships.setStarshipsid(StarWarsObj.extractIdFromUrl(starships.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(starships);
            }
        }

        folder = new File("src/main/resources/org/tony/jsons/vehicles/");
        listOfFiles = folder.listFiles();
        assert listOfFiles != null;
        for(File f: listOfFiles) {
            if(!f.getPath().equals("src/main/resources/org/tony/jsons/vehicles/.DS_Store")) {
                System.out.println(f);
                ObjectMapper mapper = new ObjectMapper();
                Vehicles vehicles = mapper.readValue(f, Vehicles.class);
                System.out.println(vehicles.getUrl());
                vehicles.setVehiclesid(StarWarsObj.extractIdFromUrl(vehicles.getUrl()));
                DbConnection.insertIntoStarWarsApiDb(vehicles);
            }
        }


    }



}
