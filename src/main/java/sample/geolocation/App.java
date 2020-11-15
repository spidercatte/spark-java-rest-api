package sample.geolocation;

import sample.geolocation.route.GeolocationRoute;
import com.google.gson.Gson;

public class App {

    public static void main(String[] args) {
        Gson gson = new Gson();
        GeolocationRoute.configureRoutes(gson);
    }

}