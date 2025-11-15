/*
 * - Daca punctajul este mai mic de 50, nota este "Insuficient"
*  - Daca punctajul este intre 50 si 64, nota este "Suficient"
*  - Daca punctajul este intre 65 si 79, nota este "Bine"
*  - Daca punctajul este intre 80 si 89, nota este "Foarte bine"
*  - Daca punctajul este intre 90 si 100, nota este "Excelent"
*  - Daca studentul este absent, nota este "Absent"
*/

public class PunctajExamen {
    public static void main(String[] a) {
        int punctaj = 99;
        boolean prezenta = false;
        String nota;

        if (!prezenta) { // prezenta == false
            nota = "Absent";
        } else {
            switch (punctaj / 10) {
                case 10:
                case 9:
                    nota = "Excelent";
                    break;
                case 8:
                    nota = "Foarte bine";
                    break;
                case 7:
                case 6:
                    if (punctaj >= 65) nota = "Bine";
                    else nota = "Suficient";
                    break;
                case 5:
                    nota = "Suficient";
                    break;
                default:
                    nota = "Insuficient";
            }
        }
        System.out.println("Nota finala: " + nota);
    }
}
