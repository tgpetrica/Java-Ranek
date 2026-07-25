package University;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student (String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String currentProgram) {
        program = currentProgram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int currentYear) {
        year = currentYear;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double newFee) {
        fee = newFee;
    }

    @Override
    public String toString() {
        return "Student {name: " + getName() + 
        ", address: " + getAddress() + 
        ", program: " + program +
        ", year: " + year +
        ", fee: " + fee +
        "},";
    }

}
