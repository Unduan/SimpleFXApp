package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class MainController {

    @FXML
    private AnchorPane mainScreenPanel;

    @FXML
    private void removeFocusFromButton(ActionEvent actionEvent) {
        mainScreenPanel.requestFocus();
    }

    @FXML
    private void enteredOnButton(MouseEvent mouseEvent) {
    }

    @FXML
    private void pressedOnButton(MouseEvent mouseEvent) {
        mainScreenPanel.requestFocus();
    }

    @FXML
    private void releasedOnButton(MouseEvent mouseEvent) {
    }
}
