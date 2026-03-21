abstract class Payment {
    abstract void pay(double amount);
}

class CashPayment extends Payment {
    void pay(double amount) {
        System.out.println("Cash payment: " + amount + " EUR.");
    }
}

class CardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Bank transfer: " + amount + "EUR.");
    }
}

class PaypalPayment extends Payment {
    void pay(double amount) {
        System.out.println("Electronic transfer: " + amount + "EUR.");
    }
}

public class Payments{
    public static void main(String[] args) {
        Payment p1 = new CashPayment();
        Payment p2 = new CardPayment();
        Payment p3 = new PaypalPayment();

        // pX este o plata, dar in realitate este o plata card/cash/electronica

        p1.pay(40);
        p2.pay(20.5);
        p3.pay(5);
    }
}