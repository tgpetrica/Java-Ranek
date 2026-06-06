public class RapidBox {
    public static void main(String[] args) {
        Livrare<String> livrare1 = new Livrare<>("Carte", "str Icoanei nr 27, Bucuresti");
        livrare1.afiseazaDetalii();
        Livrare<Flori> livrare2 = new Livrare(new Flori(), "Calea Dorobantilor nr 32, Bucuresti");
        livrare2.afiseazaDetalii();

        Livrare<Mobila> livrare3 = new Livrare(new Mobila(), "str Mihai Eminescu nr 138, Bucuresti");
        livrare3.afiseazaDetalii();


        
    }
}

class Flori{}

class Mobila {}

class Livrare<T> {
    String adresaDestinatar;
    T produs;

    public Livrare(T produs, String adresaDestinatar) {
        this.produs = produs;
        this.adresaDestinatar = adresaDestinatar;
    }

    void afiseazaDetalii() {
        System.out.println("Se livreaza " + produs + " catre " + adresaDestinatar);
    }
}
