package creational.singleton;

public class ConfigData {
    private static ConfigData instance;

    private ConfigData() {}

    public static ConfigData getInstance() {
        if (instance == null) {
            instance = new ConfigData();
        }
        return instance;
    }

    public String getMessage() {
        return "My Config Data";
    }
}
