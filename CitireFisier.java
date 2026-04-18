import java.io.FileReader;
import java.io.IOException;

public class CitireFisier {
    public static void main(String[] args) {
        try {
            System.out.println("mesaj");
            FileReader fr = new FileReader("input.txt");
            System.out.println("tr");
        } catch (IOException e) {
            System.out.println("fisierul nu a fost gasit.");
        } finally {
            System.out.println("stop");
        }
    }
}