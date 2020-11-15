package sample.geolocation.config;

public class DefaultConfig implements Config{
    @Override
    public String getGeolocationAPIKey() {
        return "test";
    }
}
