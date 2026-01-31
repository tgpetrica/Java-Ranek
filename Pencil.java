public class Pencil {
    public static int total = 0; // O proprietate marcată ca fiind statică este comună tuturor instanțelor unei clase.
    public Pencil() {
        total += 1;
    }
    public static void main(String[] args) {
        Pencil p1 = new Pencil();
        Pencil p2 = new Pencil();
        Pencil p3 = new Pencil();
        System.out.println(Pencil.total);
    }
    // Campurile statice        apartin clasei.
    // Campurile non-statice    apartin obiectului.

    /*
    JVM = Java Virtual Machine
    */
}

