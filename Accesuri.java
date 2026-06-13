public class Accesuri {
    public static void main(String[] args) {
        final int READ = 1;
        final int WRITE = 2;
        final int DELETE = 4;
        final int STAFF = 8;

        int permission = 0;
        permission = permission | READ;
        System.out.println(permission);

        permission = permission | WRITE;
        System.out.println(permission);

        if ((permission & DELETE) != 0) {
            System.out.println("are drept de stergere");
        } else {
            System.out.println("nu are drept de stergere");
        }

        permission |= DELETE;
        if ((permission & DELETE) != 0) {
            System.out.println("are drept de stergere");
        } else {
            System.out.println("nu are drept de stergere");
        }
        System.out.println(permission);

        permission = permission & ~WRITE;
        System.out.println(permission);
    }
}