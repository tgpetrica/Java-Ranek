import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;

    Book (String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + ", " + author;
    }
}

class BookNotFoundException extends RuntimeException {
    BookNotFoundException(String e) {
        super(e);
    }
}

class AuthorNotFoundException extends RuntimeException {
    AuthorNotFoundException(String e) {
        super(e);
    }
}

public class Library {
    static ArrayList<Book> books = new ArrayList<>();

    static void addBook (String title, String author) {
        if (title.isBlank()) {
            throw new IllegalArgumentException("[EXC] Titlul cartii nu pot fi gol.");
        }
        
        if (author.isBlank()) {
            throw new IllegalArgumentException("[EXC] Autorul cartii nu pot fi gol.");
        }

        books.add(new Book(title, author));
        System.out.println("[OK] Carte adaugata cu succes");
    }

    static void removeBook(String title) {
        Book bookToRemove = null;

        for (Book b : books) {
            if (b.title.toUpperCase().equals(title.toUpperCase())) {
                bookToRemove = b;
                break;
            }
        }

        if (bookToRemove != null) {
            books.remove(bookToRemove);
            System.out.println("[OK] Cartea a fost stearsa.");
        } else {
            throw new BookNotFoundException("[EXC] Cartea cu titlul specificat nu a fost gasita.");
        }
    }

    static void getBooks() {
        if (books.isEmpty()) {
            System.out.println("[OK] Nu exista carti de afisat");
            return;
        }
        
        for (Book b : books) {
            System.out.println(b);
        }
    }

    static void findBooksByAuthor (String author) {
        boolean found = false;

        for (Book b : books) {
            if (b.author.toUpperCase().equals(author.toUpperCase())) {
                System.out.println(b);
                found = true;
            }
        }

        if (!found) {
            throw new AuthorNotFoundException("[EXC] Nu au fost gasite carti scrise de autorul specificat");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("MENIU: 1 - add, 2 - remove, 3 - cautare, 4 - afisare, 0 - EXIT");

            System.out.print("Optiune: ");
            int option = Integer.parseInt(sc.nextLine());

            try {
                switch (option) {
                    case 1:
                        System.out.print("Introdu titlul cartii: ");
                        String title = sc.nextLine();

                        System.out.print("Introdu autorul cartii: ");
                        String author = sc.nextLine();

                        addBook(title, author);
                        break;
                    
                    case 2:
                        System.out.print("Titlul de sters: ");
                        String titleToBeRemoved = sc.nextLine();

                        removeBook(titleToBeRemoved);
                        break;

                    case 3:
                        System.out.print("Autorul cautat: ");
                        String booksByAuthor = sc.nextLine();

                        findBooksByAuthor(booksByAuthor);
                        break;
                    
                    case 4:
                        getBooks();
                        break;
                    
                    case 0:
                        System.out.println("La revedere!");
                        sc.close();
                        return;
                
                    default:
                        System.out.println("Optiune invalida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
