public class Final {
    String name;
    final int MAX_SCORE = 100;

    public Final (String name) {
        this.name = name;
    }

    public final void hello() {
        System.out.println("Hey, " + name);
    }

    public void change() {
        int x = 10;
        System.out.println("x = " + x);
        System.out.println("MAX_SCORE = " + MAX_SCORE);

        x = 20;
        System.out.println("x = " + x);
        System.out.println("MAX_SCORE = " + MAX_SCORE);
    }

    public static void main(String[] args) {
        Final obj = new Final("Teodor");
        obj.hello();
        obj.change();
    }


}
