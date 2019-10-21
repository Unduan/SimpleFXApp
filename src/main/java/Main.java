import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage stage) throws Exception {
        URL resource = getClass().getClassLoader().getResource("LoginPanel.fxml");
        if (resource != null){
            System.out.println("Ruszyłem!");
            Parent root = FXMLLoader.load(resource);
            stage.setScene(new Scene(root));
            stage.show();
        }
    }
}
