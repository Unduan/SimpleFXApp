package controllers;

import configuration.LangProperties;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Pane paneNewGame, paneLoadGame, paneScoreBoard, paneOptions;

    @FXML
    private Button btnLoadGame, btnNewGame, btnOptions, btnScoreBoard, btnExitGame;

    @FXML
    private AnchorPane mainScreenPanel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        if(!LangProperties.getLangProperties().isEmpty()){
            btnNewGame.setText(LangProperties.getLangProperties().getProperty("btnNewGame"));
            btnLoadGame.setText(LangProperties.getLangProperties().getProperty("btnLoadGame"));
            btnOptions.setText(LangProperties.getLangProperties().getProperty("btnOptions"));
            btnScoreBoard.setText(LangProperties.getLangProperties().getProperty("btnScoreBoard"));
            btnExitGame.setText(LangProperties.getLangProperties().getProperty("btnExitGame"));
        }
        mainScreenPanel.requestFocus();
    }

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

    @FXML
    public void goToNewGamePanel(MouseEvent mouseEvent) {
        paneNewGame.setVisible(true);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(false);

    }

    public void goToLoadPanel(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(true);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(false);
    }

    public void goToOptions(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(true);
        paneScoreBoard.setVisible(false);
    }

    public void goToScoreBoard(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(true);
    }

    public void goToExitGame(MouseEvent mouseEvent) {
        Platform.exit();


    }
}
