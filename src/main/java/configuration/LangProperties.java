package configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LangProperties {

    static final Logger LOGGER = Logger.getLogger(LangProperties.class.getName());

    private static Properties TEXT_FILLER = new Properties();

    public static void setLangProperties(LanguageEnum lang){
        Path path = Paths.get(lang.path).toAbsolutePath();
        if (Files.exists(path)) {
            try (BufferedReader bufferedReader = Files.newBufferedReader(path)) {
                TEXT_FILLER.load(bufferedReader);
                LOGGER.log(Level.INFO, "Language loaded!");
            } catch (IOException e) {
                e.getMessage();
                //TODO ERROR SCREEN
            }
        } else{
            LOGGER.log(Level.WARNING, "Missing text file!!!!");
        }
    }

    public static Properties getLangProperties(){
        return TEXT_FILLER;
    }
}
