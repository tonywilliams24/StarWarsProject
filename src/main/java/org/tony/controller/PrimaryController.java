package org.tony.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

import java.io.IOException;
import java.sql.SQLException;

import static org.tony.script.SwapiJsonInsertScript.runScript;

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
    void submit(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        try {
            runScript();
        }catch(Exception e) {
            System.out.println(e);
        }

    }
}
