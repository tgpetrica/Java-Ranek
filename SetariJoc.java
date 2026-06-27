import java.util.Set;

public class SetariJoc {
    private SetariJoc() {
        System.out.println("Setarile jocului au fost incarcate.");
    }
    private static final SetariJoc INSTANCE = new SetariJoc();
    public static SetariJoc getInstance() {
        return INSTANCE;
    }

    private int volum;

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public int getVolum() {
        return volum;
    }

    public static void main(String[] args) {
        SetariJoc s1 = SetariJoc.getInstance();
        s1.setVolum(50);

        SetariJoc s2 = SetariJoc.getInstance();
        System.out.println(s2.getVolum());

        System.out.println(s1 == s2);
    }
}
