class Ax {
    int param;
    
    void afisare() {
        System.out.println(param);
    }
}

public class TestA {
    public static void main(String[] args) {
        //int var = 0;
        //Ax ax = new Ax();
        //ax.afisare();
        //System.out.println(var);

        int x = 5;
        int rezultat = (x++ + (--x)) * (++x + x--) - (--x);
        System.out.println(rezultat);

        x = 1;
        System.out.println(x++ + x++ + ++x);
        System.out.println(x);

        x = 5;
        int y = x++ + ++x;
        System.out.println(y);

    }
}
