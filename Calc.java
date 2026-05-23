public class Calc {
    static <T extends Number> double suma(T[] numere) {
        double suma = 0.0;

        for (T nr : numere) {
            suma += nr.doubleValue();
        }

        return suma;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(suma(arr1));

        Double[] arr2 = {2.5, 3.0, 4.0};
        System.out.println(suma(arr2));

        /*
        String[] arr3 = {"Ana", "Bogdan", "Camelia"};
        System.out.println(suma(arr3));

            error: method suma in class Calc cannot be applied to given types;
            System.out.println(suma(arr3));
                            ^
                required: T[]
                found:    String[]
                reason: inference variable T has incompatible bounds
                    upper bounds: Number
                    lower bounds: String
                where T is a type-variable:
                    T extends Number declared in method <T>suma(T[])
                1 error
            
            >> Explicatie: String nu mosteneste tipul Number <<
        */
    }
}
