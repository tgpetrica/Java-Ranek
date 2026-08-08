package School;

public class Address implements Validation{
    public String street;
    public String city;
    public String state;
    public String postalCode;
    public String country;

    public Address(String street, String city, String state, String postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    @Override
    public boolean validate() {
        return !street.isEmpty() && 
                !city.isEmpty() && 
                !state.isEmpty() && 
                !postalCode.isEmpty() && 
                !country.isEmpty();
    }

    @Override
    public String outputAsLabel() {
        return street + ", " + 
                city + ", " + 
                state + ", " + 
                postalCode + ", " + 
                country;
    }

    @Override
    public String toString() {
        return outputAsLabel();
    }
}
