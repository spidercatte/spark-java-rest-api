package sample.geolocation.config;

public class DevConfig implements Config{
    public String getGeolocationAPIKey() {
        return System.getProperty(Environment.GEO_KEY);
    }
}
