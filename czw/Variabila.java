package czw;

public class Variabila {
    byte camp; // atribut , de tip instanta

    // cine atribuie valoarea default la apel?
    int numar;

    public static void main(String[] args) {
        Variabila v = new Variabila();
        System.out.println(v.camp); // 0 = default int value 

        int var; // varibila locala (la nivelul unei metode)
        var = 5; // inainte de folosire trebuie initializata, altfel error: variable var might not have been initialized
        System.out.println(var);

        Masina m1 = new Masina(4, "Dacia");
        System.out.println("Masina: " + m1.numar_usi + " " + m1.marca);
        Masina m0 = new Masina(); // constructor implicit = default constructor (javac)
        System.out.println("Masina: " + m0.numar_usi + " " + m0.marca);
        Masina m2 = new Masina ("VW", 4);
        System.out.println("Masina: " + m2.numar_usi + " " + m2.marca);

        /*
            Constructorul default este generat automat de catre compilator daca nu gaseste un constructor.
            Daca gaseste constructor, compilatorul nu mai genereaza constructorul default.
        */

        Student s1 = new Student();
        //System.out.println(s1.nume.length()); // NPE: Cannot invoke "String.length()" because "<local6>.nume" is null
        
        Student s2 = new Student (1, "Mihai");
        System.out.println(s2.nume.length());

        String prenume = "Irina";
        // I    r   i   n   a
        // 0    1   2   3   4
        System.out.println("Lungime: " + prenume.length());
        System.out.println("Caracter de pe pozitia 3: " + prenume.charAt(3)); // indexarea pleaca de la 0
        System.out.println("Substring: " + prenume.substring(1));
        //System.out.println("Substring: " + prenume.substring(2,7)); // StringIndexOutOfBoundsException: Range [2, 7) out of bounds for length 5
        System.out.println("Substring: " + prenume.substring(2,5)); // endIndex exclusiv
        //System.out.println("Caracter la pozitia 5: " + prenume.charAt(5)); // StringIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println("Upper: " + prenume.toUpperCase());
        System.out.println("Lower: " + prenume.toLowerCase());
        System.out.println("Egalitatea: " + prenume.equals("irina"));

        prenume.toLowerCase(); // String este immutable; dupa ce am creat un String, acesta nu se mai poate modifica
        System.out.println(prenume);

        String firstName = prenume.toUpperCase();
        System.err.println(firstName);

        // verificarea egalitatii

        int a = 5;
        int b = 5;

        System.out.println(a == b); // true; a este 5 , b este 5, iar 5 = 5
        // pentru tipurile primitive, == compara valoarea efectiva

        char c1 = 'A';
        char c2 = 'C';
        System.out.println(c1 == c2);

        //

        Persoana p1 = new Persoana("Ana");
        Persoana p2 = new Persoana("Ana");
        System.out.println(p1 == p2);

        // pentru obiecte, == verifica daca cele doua variabile/obiecte indica spre acelasi obiect din memorie

        System.out.println(p1.equals(p1)); // true if this object is the same as the obj argument; false otherwise
        // read more: https://docs.oracle.com/javase/8/docs/api/java/lang/Object.html#equals-java.lang.Object-

        System.out.println(p1.equals(p2));

        System.out.println();

        String x = "abc"; // x = variabila, referinta de tipul String; abc = literalul String x
        String y = "abc";

        System.out.println(x == y);

        String z = new String("abc"); // forteaza crearea unui nou obiect

        System.out.println(x == z);

        System.out.println(x.equals(z));

        // String Pool unde sunt salvate literalurile String
        // read more: https://docs.oracle.com/en/java/javacard/3.2/jcapi/api_classic/javacardx/annotations/StringPool.html

        

    }

}

class Masina {
    int numar_usi;
    String marca;
    // The constructor Masina(int, String) is undefined
    // Rolul constructorului este de a initializa (da valori) campurilor unei clase la momentul instantierii (crearii unui obiect)
    Masina (int numar_usi, String marca) {
        this.numar_usi = numar_usi;
        this.marca = marca;
    }

    Masina() {
        this(0, null); // apeleaza un constructor din clasa curenta cu param int, Object
    }

    /*
        this = obiectul curent, instanta clasei in care ne aflam
    */

    Masina (String A, int B) {
        marca = A;
        numar_usi = B;
    } // nu exista ambiguitate; stim cine sunt fiecare dintre variabile (atribute sau parametrii constructorului)

    // Totusi, se obisnuieste ca numele variabilelor si metodelor sa fie date dupa ceea ce reprezinta ele sau dupa scopul lor.
    
}

class Student {
    int id; 
    String nume;

    Student (int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    Student() {
        this (0, null); // null = variabila nu refera niciun obiect
    }


}

class Persoana {
    String nume;

    Persoana(String nume) {
        this.nume = nume;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Persoana p = (Persoana) obj;
        return this.nume.equals(p.nume);
    }
}