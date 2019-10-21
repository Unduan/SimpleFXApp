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

        if(!LangProperties.TEXT_FILLER.isEmpty()){
            btnNewGame.setText(LangProperties.TEXT_FILLER.getProperty("btnNewGame"));
            btnLoadGame.setText(LangProperties.TEXT_FILLER.getProperty("btnLoadGame"));
            btnOptions.setText(LangProperties.TEXT_FILLER.getProperty("btnOptions"));
            btnScoreBoard.setText(LangProperties.TEXT_FILLER.getProperty("btnScoreBoard"));
            btnExitGame.setText(LangProperties.TEXT_FILLER.getProperty("btnExitGame"));
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
    private void goToNewGamePanel(MouseEvent mouseEvent) {
        paneNewGame.setVisible(true);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(false);

    }
    @FXML
    private void goToLoadPanel(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(true);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(false);
    }
    @FXML
    private void goToOptions(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(true);
        paneScoreBoard.setVisible(false);
    }
    @FXML
    private void goToScoreBoard(MouseEvent mouseEvent) {
        paneNewGame.setVisible(false);
        paneLoadGame.setVisible(false);
        paneOptions.setVisible(false);
        paneScoreBoard.setVisible(true);
    }
    @FXML
    private void goToExitGame(MouseEvent mouseEvent) {
        Platform.exit();


    }
}
