public class Settings {
    private Settings() {
        System.out.println("setarile au fost incarcate");
    }

    private static Settings instance;

    public static Settings getInstance() {
        if (instance == null) {
            instance = new Settings();
        }
        return instance;
    }

    public void afiseazaTema() {
        System.out.println("Tema: dark mode");
    }

    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        settings.afiseazaTema();

        Settings otherSettings = Settings.getInstance();
        System.out.println(settings == otherSettings);
    }
}
