package sample.geolocation.external;

import io.ipgeolocation.api.Geolocation;
import io.ipgeolocation.api.GeolocationParams;
import io.ipgeolocation.api.IPGeolocationAPI;

public class IPGeolocation implements RestClientGeolocationService {

    private static String API_KEYS = "27dad66cbcae470f8d5b91ca66461165";
    public IPGeolocation() {}

    public sample.geolocation.domain.Geolocation geolocate(String ipaddress) {
        IPGeolocationAPI api = new IPGeolocationAPI(API_KEYS);

        GeolocationParams geoParams = new GeolocationParams();
        geoParams.setIPAddress(ipaddress);

        Geolocation geolocation = api.getGeolocation(geoParams);

        return new sample.geolocation.domain.Geolocation(
                geolocation.getCountryName(),
                geolocation.getStateProvince(),
                geolocation.getCity(),
                geolocation.getZipCode(),
                geolocation.getLatitude(),
                geolocation.getLongitude(),
                geolocation.getIPAddress()
        );
    }
}
