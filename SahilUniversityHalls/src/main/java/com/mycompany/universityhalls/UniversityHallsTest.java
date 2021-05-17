package com.mycompany.universityhalls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class UniversityHallsTest extends Application {

    

    @Override
    public void start(Stage stage) throws IOException {
        VBox root = new VBox(10);
        root.getChildren();
        Scene scene = new Scene(root, Color.web("#ffffff"));
        stage.setScene(scene);
        stage.setTitle("SA Student Halls");
       stage.show(); 
    }

    public static void main(String[] args) {
        launch();
    }

}