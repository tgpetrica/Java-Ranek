public class ContBancarInner {
    private String titular;
    private double sold;

    public ContBancarInner(String titular, double sold) {
        this.titular = titular;
        this.sold = sold;
    }

    public void afisare() {
        System.out.println("sold disponibil: " + sold);
    }

    public class Card {
        public void plateste(double suma) {
            if (suma <= 0) {
                System.out.println("Suma trebuie sa fie cel putin egala cu 1.00");
            } else if (suma <= sold) {
                sold -= suma;
                System.out.println("Plata realizata cu succes.");
            } else {
                System.out.println("Sold insuficient.");
            }
        }
    }
    
    public static void main(String[] args) {
        ContBancarInner cont = new ContBancarInner("Teodor", 500);
        ContBancarInner.Card card = cont.new Card();

        cont.afisare();

        card.plateste(150);
        cont.afisare();

        ContBancarInner.Card cardUnu = cont.new Card();
        cardUnu.plateste(23);
        cont.afisare();
    }
}
