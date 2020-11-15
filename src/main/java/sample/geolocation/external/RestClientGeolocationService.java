package sample.geolocation.external;

import sample.geolocation.domain.Geolocation;

public interface RestClientGeolocationService {
    public Geolocation geolocate(String ipaddress);
}
