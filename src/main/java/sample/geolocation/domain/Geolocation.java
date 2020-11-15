package sample.geolocation.domain;

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

    public String getCountryName() {
        return countryName;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getIp() {
        return ip;
    }
}
