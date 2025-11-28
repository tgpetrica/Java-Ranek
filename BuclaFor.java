public class BuclaFor {
    public static void main(String[] args) {
        /*
            STRUCTURI REPETITIVE

            - for - cu numar cunoscut de pasi

            Sintaxa:

            for (initializare; conditiei; actualizare) {
                // bloc de instructiuni
            }

            1. initializarea: se executa o singura data
            2. conditiei: se evelueaza conditia inainte de fiecare iteratie
            3. actualizare: se executa la sfarsitul fiecarei iteratii

            Ordinea pasilor:
            1. initializare
            2. evaluarea conditiei
            3. daca conditia este adevarata => se executa blocul de instructiuni
            4. actualizare
            5. se revenine la pasul 2.
        */

        int[] v = {50, 0, 21, 19, 15};

        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }

        // for (;;) {
        //     System.out.print(". ");
        // }
        /*
            - nu exista initializare
            - nu exista conditie de oprire
            - nu exista pas de actualizare
            => bucla nu se opreste niciodata => BUCLA este INFINITA
            Dar, for este o bucla finita, cu numar de pasi cunoscut,
            Deci, folosirea buclei FOR ca in exemplul de mai sus nu este corecta.
        */

        // for (int i = 0; i < 10; i--) {
        //     System.out.print(i + " ");
        // }

        // Obs. Conditia este formulata gresit. Bucla devine INFINITA.

        for (int i = 0; i < 10;) {
            System.out.print(i + " ");
        }

        // Obs. Lipsa actualizarii varibilei de control duce la bucla INFINITA.

        // Scopul buclei FOR NU ESTE de a fi o bucla INFINITA.
    }
}
