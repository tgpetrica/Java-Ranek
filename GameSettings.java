enum GameSettingsEnum {
    INSTANCE;

    private int volum = 60;

    public void setVolum(int volum) {
        this.volum = volum;
    }

    public void getVolum() {
        System.out.println(volum);
    }
}

public class GameSettings {
    public static void main(String[] args) {
        GameSettingsEnum.INSTANCE.setVolum(100);
        GameSettingsEnum.INSTANCE.getVolum();
    }
}
