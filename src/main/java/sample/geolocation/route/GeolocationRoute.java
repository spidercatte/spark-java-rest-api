package sample.geolocation.route;

import sample.geolocation.service.GeolocationService;
import com.google.gson.Gson;

import static spark.Spark.*;

public class GeolocationRoute {

    private static GeolocationService service;

    static {
        service = new GeolocationService();
    }

    public static void configureRoutes(Gson gson) {
        path("/api/geolocate", () -> {
            get("/:ip_addresss", (request, response) -> service.findByIpAddress(request), gson::toJson);
            //exception(IllegalStateException.class, (exception, request, response) -> {
            //    // Handle the exception here
            //});
        });
    }
}
