public class Course {
    private String title;
    private String instructor;
    private int duration;

    private static int courseCount = 0;

    public Course (String title, String instructor, int duration) {
        this.title = title;
        this.instructor = instructor;
        this.duration = duration;
        courseCount++;
    }

    public String get_info() {
        return "Course title: " + title + 
        ", Instructor: " + instructor +
        ", duration: " + duration;
    }

    public static void main(String[] args) {
        Course c1 = new Course("JF", "Teodor P", 90);
        System.out.println(c1.get_info());
        System.out.println(courseCount);
        Course c2 = new Course("Alg", "Silvia D", 120);
        System.out.println(c2.get_info());
        System.out.println(courseCount);
        
        Course POO = new Course ("POO", "Paul P", 90);
        System.out.println(courseCount);
    }
    
}
