package view;

import javafx.scene.SubScene;
import javafx.scene.layout.AnchorPane;

public class InnerScreen extends SubScene {


    public InnerScreen(double hight, double widht) {
        super(new AnchorPane(), hight, widht);

        prefHeight(hight);
        prefWidth(widht);
        
        this.setStyle("-fx-background-color: green; -fx-background-radius: 10 10 0 10");
        
    }
}
