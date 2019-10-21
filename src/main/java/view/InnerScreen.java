package view;

import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class InnerScreen extends SubScene {


    public InnerScreen(double hight, double widht) {
        super(new Pane(), widht,hight);

        prefHeight(hight);
        prefWidth(widht);

        Pane pane = (Pane) this.getRoot();
        pane.setStyle("-fx-background-color: green; -fx-background-radius: 10 10 10 10");

    }
}
