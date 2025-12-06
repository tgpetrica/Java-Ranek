public class Masina {
    // atribute
    String marca;
    int vitezaMaxima;
    float masaMaxima;
    int numarUsi;
    String culoare;

    // Constructor
    public Masina(String marca, int vitezaMaxima, int numarUsi,float masaMaxima, String culoare) {
        this.marca          = marca;
        this.vitezaMaxima   = vitezaMaxima;
        this.numarUsi       = numarUsi;
        this.masaMaxima     = masaMaxima;
        this.culoare        = culoare;
        /*
         * Referinta this refera obiectul pe care il cream.
         * Prin dereferentiere si prin referinta this putem accesa atributele clasei
         * 
         * Valoarea din dreapta egalului este valoarea transmisa prin parametrii constructorului
         */
    }

    public Masina() { // constructor fara parametri ~ default
        this.marca = "marca fara nume";
        this.vitezaMaxima = 0;
        this.numarUsi = 0;
        this.masaMaxima = 0;
        this.culoare = "nu s-a ales culoare";
    }

    void Masina() { // acesta nu este un constructor, ci o metoda
        System.out.println("mesaj");
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

        Masina m2 = new Masina(); // apel al constructorului implicit
        System.out.println(m2.marca + " " + m2.vitezaMaxima + " " + m2.numarUsi + 
            " " + m2.masaMaxima + " " + m2.culoare);
        m2.Masina();
    }

}
