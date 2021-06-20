module org.tony {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;
    requires com.google.gson;

    opens org.tony to javafx.fxml, com.google.gson;
    opens org.tony.script.model to javafx.fxml, com.google.gson;
    exports org.tony;
    exports org.tony.script.model;
    exports org.tony.controller;
    opens org.tony.controller to javafx.fxml, com.google.gson;
}