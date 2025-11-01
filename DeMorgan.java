public class DeMorgan {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        if (a || b) {
            System.out.println("Cel putin una este falsa.");
        }

        // 1. negarea unei conjunctii (AND)
        // !(a && b) == (!a || !b)

        if (!(a && b)) {
            System.out.println("Cel putin una este falsa.");
        }

        if ((!a || !b)) {
            System.out.println("Cel putin una este falsa.");
        }

        // 2. negarea unei disjunctii (OR)
        // !(a || b) == (!a && !b)
        int x = 0;
        int y = 17;

        if (!(x > 5 || y < 10)) {
            System.out.println("x <= 5 si y >= 10");
        }

        if ((x <= 5 && y >= 10)) {
            System.out.println("x <= 5 si y >= 10");
        }

    }
}
