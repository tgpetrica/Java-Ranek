class Student {
    String nume;
    int varsta;

    Student (String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Student_name: " + nume + ", Student_age: " + varsta;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) {
            return false;
        }

        Student s = (Student ) o;

        return this.nume.equals(s.nume) && this.varsta == s.varsta;
    }
}

public class Reff {
    public static void main(String[] args) {
        Student s = new Student("Teodor", 23);
        System.out.println(s);

        Student t = new Student("Andrei", 19);
        Student v = new Student("Andrei", 19)

        System.out.println(t);

        System.out.println(s.equals(t));
        System.out.println(t.equals(v));
    }
}
