package controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class MainController {
    @FXML
    public Pane paneNewGame, paneLoadGame, paneScoreBoard, paneOptions;

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
