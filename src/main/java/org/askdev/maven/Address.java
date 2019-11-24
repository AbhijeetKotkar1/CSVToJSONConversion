package org.askdev.maven;

public class Address {

    String city;
    String stateCode;

    public Address(String city, String stateCode) {
        this.city = city;
        this.stateCode = stateCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }
}
