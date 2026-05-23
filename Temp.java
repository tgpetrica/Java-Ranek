public class Temp<T> {
    void print (T x) {
        System.out.println(x);
    }
    public static void main(String[] args) {
        Temp<String> SO = new Temp<String>();
        String s = "hello";
        SO.print(s);

        Temp<Integer> IO = new Temp<Integer>();
        Integer i = 37;
        IO.print(i);

        Printer p = new Printer();
        Integer x = 50;
        p.print(x);
        Double d = 4.7;
        p.print(d);
        Object obj = new Object();
        p.print(obj); // se apeleaza toString din Object
    }
}

class Printer {
    <T> void print(T x) {
        System.out.println(x);
    }
}
