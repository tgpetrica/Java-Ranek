package School;

public class Professor extends Person {
    private int salary;

    public Professor(String name, String phoneNumber, String email, Address address,
                    int salary
    ) {
        super(name, phoneNumber, email, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        if (newSalary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        salary = newSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
            ", Salary: " + salary;
    }    
}
