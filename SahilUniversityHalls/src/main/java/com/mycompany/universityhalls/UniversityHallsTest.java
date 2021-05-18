package com.mycompany.universityhalls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class UniversityHallsTest extends Application {

    // components
    private Label headingLbl = new Label("Rent Student Hall Room");
    private Label studentDetails = new Label("Enter Student details");
    private Label forenameLbl = new Label("Forename:");
    private TextField forenameField = new TextField();
    private Label surnamelbl = new Label("Surname:");
    private TextField surnameField = new TextField();
    private Label studentGender = new Label("Gender:");
    private TextField genderField = new TextField();
    private Label studentAddress = new Label("Address:");
    private TextField addressField = new TextField();
    private Label nationalLbl = new Label("Nationality:");
    private TextField nationalField = new TextField();
    private Label studyDateLbl = new Label("Date of Study");
//    private 
    private Label dobLbl = new Label("Date of birth:");
    private Label phoneNumLbl = new Label("Contact Number:");
    private TextField phoneNumField = new TextField();
    private Label idLbl = new Label("Student ID:");
    private TextField idField = new TextField();
    private Label healthLbl = new Label("Health Conditions");
    private TextField healthField = new TextField();
    private Separator sectSepator = new Separator(); 
    private Separator sectSepator2 = new Separator();
    private Separator sectSepator3 = new Separator();
    @Override
    public void start(Stage stage) throws IOException {
        // Vbox Created
        VBox root = new VBox(10);
        // add nodes to the Vbox
        root.getChildren();
        // Create the Scene
        Scene scene = new Scene(root, Color.web("#ffffff"));
        // set scene with title and with stage used to display application
        stage.setScene(scene);
        stage.setTitle("SA Student Halls");
       stage.show(); 
    }

    public static void main(String[] args) {
        launch();
    }

}