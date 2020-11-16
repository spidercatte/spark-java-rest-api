package sample.geolocation;

import com.beerboy.ss.SparkSwagger;
import sample.geolocation.route.GeolocationRoute;
import com.google.gson.Gson;
import spark.Service;

public class App {

    public static void main(String[] args) {
        Gson gson = new Gson();
        GeolocationRoute.configureRoutes(gson);

        Service spark = Service.ignite()
                .ipAddress("localhost")
                .port(55555);

        SparkSwagger.of(spark);
    }

}