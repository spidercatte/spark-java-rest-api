package sample.geolocation.config;

public class Environment {
    public static String GEO_KEY = "geo_key";
    private static String ENV = "env";
    private static String DEV = "dev";
    private static Config config;

    static{
        config = new DefaultConfig();
    }

    public static Config getConfig() {
        if (System.getProperty(ENV).equals(DEV)) {
            config = new DevConfig();
        }

        return config;
    }
}
