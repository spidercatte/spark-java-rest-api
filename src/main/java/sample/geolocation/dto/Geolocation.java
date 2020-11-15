package sample.geolocation.dto;

public class Geolocation {

    private final String countryName;
    private final String stateProvince;
    private final String city;
    private final String zipCode;
    private final String latitude;
    private final String longitude;
    private final String ip;

    public Geolocation(String countryName,
                       String stateProvince,
                       String city,
                       String zipCode,
                       String latitude,
                       String longitude,
                       String ip){
        this.countryName = countryName;
        this.stateProvince = stateProvince;
        this.city = city;
        this.zipCode = zipCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.ip = ip;
    }

    public static Geolocation fromDomain(sample.geolocation.domain.Geolocation domain) {
        return new Geolocation(
                domain.getCountryName(),
                domain.getStateProvince(),
                domain.getCity(),
                domain.getZipCode(),
                domain.getLatitude(),
                domain.getLongitude(),
                domain.getIp()
        );
    }
}
