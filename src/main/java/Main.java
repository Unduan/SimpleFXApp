import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

//import java.util.logging.Level;
//import java.util.logging.Logger;

public class Main extends Application {

    //static Logger LOGGER = Logger.getLogger(Main.class.getName());
    private static Scene scene;

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/mainScreen.fxml"));
            scene = new Scene(root);
            scene.getStylesheets().add(
                   getClass().getResource("/css/mainStyle.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("SampleFxGame");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
            //TODO screen with error code
        }
    }

//    private  Parent loadFXML(String fxml) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.getClass().getResource( fxml ));
//        return fxmlLoader.load();
//    }
    public static void main(String[] args) {
        launch(args);
       // LOGGER.log(Level.INFO, "Application close!");
    }
}