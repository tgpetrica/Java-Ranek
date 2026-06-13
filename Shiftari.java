public class Shiftari {
    // x << n = x * 2 ^ n
    // x >> n = x / 2 ^ n
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x << 1);
        System.out.println(x << 2);
        System.out.println(x << 3);

        x = 40;
        System.out.println(x >> 1);
        System.out.println(x >> 2);
        System.out.println(x >> 3);

        final int READ = 1 << 0;
        final int WRITE = 1 << 1;
        final int DELETE = 1 << 2;
        final int STAFF = 1 << 3;

        int permission = 0;

        permission |= READ;
        permission |= WRITE;
        permission |= STAFF;

        System.out.println("R?: " + ((permission & READ) != 0));
        System.out.println("W?: " + ((permission & WRITE) != 0));
        System.out.println("D?: " + ((permission & DELETE) != 0));
        System.out.println("S?: " + ((permission & STAFF) != 0));
    }
}
