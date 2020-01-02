package com.src.java.clone;

public class Address implements Cloneable{

    private String state;
    private String country;
    private String district;
    private String city;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", district='" + district + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
