package com.mycompany.universityhalls;

import java.io.IOException;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        UniversityHallsTest.setRoot("primary");
    }
}