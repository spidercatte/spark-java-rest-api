 Project Title

Sample Geolocation project.

## Description

A simple geolocation project that looks up an ip address (ipv4 or ipv6) using via api/geolocate/:ip_address.
This uses https://ipgeolocation.io/ free access. It requires api key to use the api.

## Getting Started

### Dependencies

* Uses https://ipgeolocation.io/


### Installing

* Clone this branch: 
https://github.com/spidercatte/spark-java-rest-api.git

### Executing program

1. Sig-up with ipgeolocation.io to get a valid api key
2. Run `mvn install` then `mvn clean package` to generate the package
3. Run `mvn exec:java -Dexec.mainClass="App" -Denv=dev -Dgeo_key=yourKey`

## Acknowledgments

* [wellingtoncosta/spark-java-rest-api](https://github.com/wellingtoncosta/spark-java-rest-api)
