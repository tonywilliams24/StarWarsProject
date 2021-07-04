package org.tony;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tony.model.*;
import org.tony.repository.Repository;
import org.tony.script.SwapiJsonInsertScript;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;

import static org.tony.repository.Repository.*;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        Repository.retrieveAllPeopleFromDb();
        Repository.retrieveAllFilmsFromDb();
        Repository.retrieveAllSpeciesFromDb();
        Repository.retrieveAllPlanetsFromDb();
        Repository.retrieveAllStarshipsFromDb();
        Repository.retrieveAllVehiclesFromDb();
        retrievePeopleAssociations();
        retrieveFilmsAssociations();
        retrievePlanetsAssociations();
        retrieveSpeciesAssociations();
        retrieveStarshipsAssociations();
        retrieveVehiclesAssociations();
        Iterator<People> i = getPeopleRepository().iterator();
        People people = i.next();
        System.out.println("Person Name: " + people.getName());
        try {
            Films film = people.getFilms().iterator().next();
            System.out.println("Film Title: " + film.getTitle());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Planets planet = people.getHomeworld().iterator().next();
            System.out.println("Planet Name: " + planet.getName());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Species species = people.getSpecies().iterator().next();
            System.out.println("Species Name: " + species.getName());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Starships starship = people.getStarships().iterator().next();
            System.out.println("Starship Name: " + starship.getName());
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Vehicles vehicles = people.getVehicles().iterator().next();
            System.out.println("Vehicles Name: " + vehicles.getName());
        } catch (Exception e) {
            System.out.println(e);
        }
        launch();
    }

}