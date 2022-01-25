package model;

public class Adress {
    private String street;
    private int postcode;

    public Adress() {
    }

    public Adress(String street, int postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public int getPostcode() {
        return postcode;
    }

}