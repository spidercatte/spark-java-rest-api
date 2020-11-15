package sample.geolocation.service;

import sample.geolocation.external.IPGeolocation;
import sample.geolocation.external.RestClientGeolocationService;
import sample.geolocation.dto.Geolocation;
import spark.Request;

public class GeolocationService {

    RestClientGeolocationService service;
    public GeolocationService() {
        service = new IPGeolocation();
    }

    public Geolocation findByIpAddress(Request request) {
        String ip_address = request.attribute("ip_address");
        return Geolocation.fromDomain(service.geolocate(ip_address));
    }
}
