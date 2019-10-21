
import configuration.LangProperties;
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

    private static final String PROPERTIES_PATH = "src/main/text.properties";
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
        Path path = Paths.get(PROPERTIES_PATH).toAbsolutePath();
        if (Files.exists(path)) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
                LangProperties.TEXT_FILLER.load(bufferedReader);
                LOGGER.log(Level.INFO, "Text file loaded!");
            }
        } else{
            LOGGER.log(Level.WARNING, "Missing text file!!!!");
        }
        launch(args);
        LOGGER.log(Level.INFO, "Application close!");
    }
}