package org.tony;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.tony.repository.Repository;
import org.tony.script.SwapiJsonInsertScript;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;

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
        SwapiJsonInsertScript.runScript();
        Repository.retrieveAllPeopleFromDb();
        Repository.retrieveAllFilmsFromDb();
        Repository.retrieveAllSpeciesFromDb();
        Repository.retrieveAllPlanetsFromDb();
        Repository.retrieveAllStarshipsFromDb();
        Repository.retrieveAllVehiclesFromDb();
        launch();
    }

}