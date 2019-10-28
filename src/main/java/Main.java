
import configuration.LangProperties;
import configuration.LanguageEnum;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main extends Application {

    static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static Scene scene;

    private static final String FXML_MAIN = "fxml/mainScreen.fxml";


    @Override
    public void start(Stage primaryStage) {
        try {
            LOGGER.log(Level.INFO, "Application start!");
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(FXML_MAIN));
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


    public static void main(String[] args) throws IOException {
        LangProperties.setLangProperties(LanguageEnum.ENGLISH);
        launch(args);
        LOGGER.log(Level.INFO, "Application close!");
    }
}