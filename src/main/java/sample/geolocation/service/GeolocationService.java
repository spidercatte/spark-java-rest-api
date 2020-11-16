package sample.geolocation.service;

import inet.ipaddr.AddressStringException;
import inet.ipaddr.IPAddress;
import inet.ipaddr.IPAddressString;
import sample.geolocation.external.IPGeolocation;
import sample.geolocation.external.RestClientGeolocationService;
import sample.geolocation.dto.Geolocation;
import spark.Request;

public class GeolocationService {

    RestClientGeolocationService service;
    public GeolocationService() {
        service = new IPGeolocation();
    }

    public Geolocation findByIpAddress(Request request) throws IllegalAccessException {
        String ip_address = request.attribute("ip_address");

        IPAddressString ipAddressString = new IPAddressString(ip_address);
        if(!(ipAddressString.isIPv4() ||ipAddressString.isIPv6())) {
            throw new IllegalArgumentException(String.format("Invalid ip address %s", ip_address));
        }

        return Geolocation.fromDomain(service.geolocate(ip_address));
    }
}
