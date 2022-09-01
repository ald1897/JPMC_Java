package oops;

public class Address {
    private String city;
    private String country, streetno1, streetno2, zip, landmark;

    public Address() {
    }

    public Address(String city, String country, String streetno1, String streetno2, String zip, String landmark) {
        this.city = city;
        this.country = country;
        this.streetno1 = streetno1;
        this.streetno2 = streetno2;
        this.zip = zip;
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreetno1() {
        return streetno1;
    }

    public void setStreetno1(String streetno1) {
        this.streetno1 = streetno1;
    }

    public String getStreetno2() {
        return streetno2;
    }

    public void setStreetno2(String streetno2) {
        this.streetno2 = streetno2;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", streetno1='" + streetno1 + '\'' +
                ", streetno2='" + streetno2 + '\'' +
                ", zip='" + zip + '\'' +
                ", landmark='" + landmark + '\'' +
                '}';
    }
}
