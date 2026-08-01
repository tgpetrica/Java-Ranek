package School;

public class Address implements Validation{
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String country;

    public Address(String street, String city, String state, String postalCode, String county) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        return !street.isEmpty() && 
                !city.isEmpty() && 
                !state.isEmpty() && 
                !postalCode.isEmpty() && 
                !country.isEmpty();
    }

    public String outputAsLabel() {
        return street + ", " + 
                city + ", " + 
                state + ", " + 
                postalCode + ", " + 
                country;
    }

    public String toString() {
        return outputAsLabel();
    }
}
