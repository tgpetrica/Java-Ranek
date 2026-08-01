package School;

public class Person {
    public String name;
    public String phoneNumber;
    public String email;
    public Address address;

    public Person(String name, String phoneNumber, String email, Address address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    public void purchaseParkingPass() {
        System.out.println(name + "purchased a parking pass.");
    }

    @Override
    public String toString() {
        return "Name:" + name +
             ", Phone: " + phoneNumber +
             ", Email:" + email +
             ", Address" + address;
    }
}