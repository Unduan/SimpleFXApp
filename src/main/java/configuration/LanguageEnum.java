package configuration;

public enum LanguageEnum {
    ENGLISH("src/main/textEN.properties"),
    POLISH("src/main/textEN.properties");

    public final String path;
    LanguageEnum(String path) {
        this.path = path;
    }
}
