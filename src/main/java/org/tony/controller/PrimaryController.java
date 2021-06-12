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
import org.tony.model.Films;

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
        URL testurl = new URL("file:src/main/resources/org/tony/json.json");
        System.out.println("clicked");
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(new URL("https://swapi.dev/api/vehicles/4/"));
        Films film = mapper.readValue(testurl,Films.class);
        System.out.println(film.getOpening_crawl());
        DbConnection.getAllTables();

    }



}
