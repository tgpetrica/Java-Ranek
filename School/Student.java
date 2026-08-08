package School;

public class Student extends Person {
    public int studentNumber;
    public double averageMark;

    public Student(String name, String phoneNumber, String email, Address address,
                    int studentNumber, double averageMark) {
                        super(name, phoneNumber, email, address);
                        this.studentNumber = studentNumber;
                        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll() {
        return averageMark >= 5.0;
    }

    @Override
    public String toString() {
        return super.toString() + 
            ", StudID: " + studentNumber +
            ", Avg Mark: " + averageMark;

    }
    
    
}
