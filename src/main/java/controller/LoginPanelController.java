package controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginPanelController {

    @FXML
    private TextField userIdTextField, passwordTextField;
    @FXML
    private void register(MouseEvent mouseEvent) {
    }
    @FXML
    private void login(MouseEvent mouseEvent) {
        userIdTextField.getText();
    }
}
