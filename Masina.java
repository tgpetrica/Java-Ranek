public class Masina {
    // atribute
    String marca;
    int vitezaMaxima;
    float masaMaxima;
    int numarUsi;
    String culoare;

    // Constructor
    public Masina(String marca, int vitezaMaxima, int numarUsi,float masaMaxima, String culoare) {
        this.marca = marca;
        this.vitezaMaxima = vitezaMaxima;
        this.numarUsi = numarUsi;
        this.masaMaxima = masaMaxima;
        this.culoare = culoare;
        /*
         * Pointerul this refera obiectul pe care il cream.
         * Prin dereferentiere si prin pointerul this putem accesa atributele clasei
         * 
         * Valoarea din dreapta egalului este valoarea transmisa prin parametrii constructorului
         */
    }

    // comportamente
    void deschide() {
        System.out.println(marca + " s-a deschis.");
    }

    void inchide() {
        System.out.println(marca + " s-a inchis.");
    }

    void accelereaza(int viteza) {
        System.out.println(marca + " accelereaza pana la " + viteza + "km/h");
    }

    void franeaza() {
        System.out.println(marca + " a franat.");
    }

    void schimbaCuloarea(String nouaCuloare) {
        System.out.println("Vechea culoare: " + culoare);
        culoare = nouaCuloare;
        System.out.println("Noua culoare: " + culoare);
    }

    public static void main(String[] args) {
        Masina m1 = new Masina("Dacia", 170, 5, 1080.0f, "albastru");
        m1.deschide();
        m1.accelereaza(50);
        m1.franeaza();
        m1.inchide();
        m1.schimbaCuloarea("rosu");
    }

}
