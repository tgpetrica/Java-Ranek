package School;

public class Main {
    public static void main(String[] args) {
        Address stuAddress = new Address(
           "Bd Dacia 32" , 
           "Bucuresti", 
           "Sector 1", 
           "12345", 
           "Romania");
        
        Address stuAddress2 = new Address(null, null, null, null, null);

        Student student = new Student(
            "Lucian Popescu", 
            "0712345678", 
            "lucia.popescu@stud.uni.ro", 
            stuAddress, 
            1001, 
            8.75);
        
        Professor professor = new Professor(
            "Silvia Ionescu", 
            "0798765432", 
            "silvia.ionescu@uni.ro", 
            null, 
            9000);
        
        System.out.println(student);
        System.out.println(professor);
        System.out.println(stuAddress.street);

        System.out.println("Se poate inrola? " + (student.isEligibleToEnroll()?"Da" : " nu"));
    }
}
