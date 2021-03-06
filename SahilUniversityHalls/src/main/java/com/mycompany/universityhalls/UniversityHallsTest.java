package com.mycompany.universityhalls;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

/**
 * JavaFX App
 */
public class UniversityHallsTest extends Application {
    private Hall hallsToStay;
    // components
    private Label headingLbl = new Label("Rent Student Hall Room");
    private Label studentLbl = new Label("Student details");
    private Label hallLbl = new Label ("Hall Details");
    private Label forenameLbl = new Label("Forename:");
    private TextField forenameField = new TextField();
    private Label surnamelbl = new Label("Surname:");
    private TextField surnameField = new TextField();
    private Label studentGender = new Label("Gender:");
    private TextField genderField = new TextField();
    private Label studentAddress = new Label("Address:");
    private TextArea addressField = new TextArea();
    private Label nationalLbl = new Label("Nationality:");
    private TextField nationalField = new TextField();
    private Label studyDateLbl = new Label("Date of Study");
    private TextField studyDateField = new TextField();
    private Label dobLbl = new Label("Date of birth:\n (dd/MM/yyyy)");
    private TextField dobField = new TextField();
    private Label phoneNumLbl = new Label("Contact Number:");
    private TextField phoneNumField = new TextField();
    private Label idLbl = new Label("Student ID:");
    private TextField idField = new TextField();
    private Label healthLbl = new Label("Health Conditions");
    private TextArea healthField = new TextArea();
    private Label hallLbl2 = new Label("Decide which hall you require? \n vegan hall  \n non-vegan hall \n disabled hall? ");
    private TextField hallField = new TextField();
    private Button addBtn = new Button("Add Student to hall");
    private Separator sectSepator = new Separator(); 
    private Separator sectSepator2 = new Separator();
    private Separator sectSepator3 = new Separator();   
    @Override
    public void start(Stage stage) throws IOException {
        hallsToStay = new Hall(20);
        
        // horizontal boxes for student details and hall details
        HBox studentDetails = new HBox(10);
        HBox studentDetails2 = new HBox(10);
        HBox studentDetails3 = new HBox(10);
        HBox hallDetails = new HBox(10);
        // add entry components to Hboxes 
        studentDetails.getChildren().addAll(forenameLbl,forenameField,surnamelbl,surnameField,studentGender,genderField);
        studentDetails2.getChildren().addAll(dobLbl,dobField,studentAddress,addressField,phoneNumLbl,phoneNumField,nationalLbl,nationalField);
        studentDetails3.getChildren().addAll(studyDateLbl,studyDateField,idLbl,idField,healthLbl,healthField);
        hallDetails.getChildren().addAll(hallLbl2,hallField);
        // Vbox Created
        VBox root = new VBox(10);
        // add nodes to the VBox
        root.getChildren().addAll(headingLbl,sectSepator,studentLbl,studentDetails,sectSepator2,studentDetails2,
        studentDetails3,sectSepator3,hallLbl,hallDetails,addBtn);
        // set min and max to componenents in GUI
        addressField.setMaxSize(200,400);
        healthField.setMaxSize(200,400);
        // Create the Scene
        Scene scene = new Scene(root, Color.web("#ffffff"));
        // set scene with title and with stage used to display application
//        addBtn.setOnAction(e -> addStudentButton());
        
        stage.setScene(scene);
        stage.setTitle("SA Student Halls");
       stage.show();
    }
    
//    private void addStudentButton(){
//        String forename = forenameField.getText();
//        String surname = surnameField.getText();
//        String gender = genderField.getText();
//        String dbDay = dobField.getText();
//        int dbDayNum = Integer.valueOf(dbDay);
//        int dateDayNum = dbDayNum;
//        String dbMonth = dobField.getText();
//        int dbMonthNum = Integer.valueOf(dbMonth);
//        int dateMonthNum = dbMonthNum;
//        String dbYear = dobField.getText();
//        int dbYearNum = Integer.valueOf(dbYear);
//        int dateYearNum = dbYearNum;
//        String address = addressField.getText();
//        String phone = phoneNumField.getText();
//        String national = nationalField.getText();
//        String id = idField.getText();
//        int numId = Integer.valueOf(id);
//        int sendID = numId;
//        String health = healthField.getText();
//        String studyDay = studyDateField.getText();
//        int studyDayNum = Integer.valueOf(studyDay);
//        int newStuDayNum = studyDayNum;
//        String studyMonth = studyDateField.getText();
//        int studyMonthNum = Integer.valueOf(studyMonth);
//        int newStudyMonthNum = studyMonthNum;
//        String studyYear = studyDateField.getText();
//        int studyYearNum = Integer.valueOf(studyYear);
//        int newStudyYearNum = studyYearNum;
//        Student studentAdd = new Student(forename,surname, gender,dateYearNum,dateMonthNum,dateDayNum, address, phone, national, 
//        sendID, health, newStudyYearNum, newStudyMonthNum, newStuDayNum);
//        hallsToStay.addStudent(studentAdd);
        
//    }
    public static void main(String[] args) {
        launch();
    }

}