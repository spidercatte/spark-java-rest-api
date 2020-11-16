package sample.geolocation.external;

import inet.ipaddr.IPAddress;
import io.ipgeolocation.api.Geolocation;
import io.ipgeolocation.api.GeolocationParams;
import io.ipgeolocation.api.IPGeolocationAPI;
import sample.geolocation.config.Environment;

public class IPGeolocation implements RestClientGeolocationService {

    public IPGeolocation() {}

    public sample.geolocation.domain.Geolocation geolocate(String ipaddress) {
        IPGeolocationAPI api = new IPGeolocationAPI(Environment.getConfig().getGeolocationAPIKey());

        GeolocationParams geoParams = new GeolocationParams();
        geoParams.setIPAddress(ipaddress);

        Geolocation geolocation = api.getGeolocation(geoParams);

        if(geolocation.getStatus() != 200) {
            throw new IllegalStateException(String.format("Status Code: %d, Message: %s\n", geolocation.getStatus(), geolocation.getMessage()));
        }

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
