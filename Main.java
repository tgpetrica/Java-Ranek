public class Main {
    public static void main(String[] args) {
        /*Exemplu ex = new Exemplu();
        ex.met2();*/
        Exemplu2 ex = new Exemplu2();
        ex.metoda();

        Persoana per1 = new Persoana();
        Persoana per2 = new Persoana("Bond", "James", "839292878432", "caprui");

        System.out.println(per2.nume);
        ex.toString();
    }
}

class Exemplu
{
    int a;

    void metoda()
    {
        int b;
        System.out.println(a);

        for(b=0; b<20; ++b)
        {
           int c=4;
           System.out.println(b);
           System.out.println(a);
           System.out.println(c);
        }

        //System.out.println(c);
    }

    void met2()
    {
        System.out.println(a);

        int b=0;
        System.out.println(b);
    }
}

class Exemplu2
{
    int a;
    int b=1;
    void metoda()
    {
        int a=5;
        System.out.println(this.a);
        System.out.println(a);
        if(a==5)
        {
            int b = 8;
            System.out.println(b);
            System.out.println(this.b);
        }
    }
}

class Persoana
{
    String nume;
    String prenume;
    String CNP; //5039573920295843903
    String culOchi;

    Persoana()
    {
        nume = "Gigel";
        prenume = "Marcel";
        CNP = "1234567890123";
        culOchi = "albastru";
    }

    Persoana(String nume, String prenume, String CNP, String culOchi)
    {
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.culOchi = culOchi;
    }
}