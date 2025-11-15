public class Semaforul {
    public static void main(String[] args) {
        String culoare = "verde";

        switch(culoare) {
            case "Verde":
            case "verde":
                System.out.println("Masinile pot traversa.");
                break;
            case "Galben":
                System.out.println("Masinile se pregatesc sa opreasca.");
                break;
            case "Rosu":
                System.out.println("Masinile nu intra in intersectie.");
                break;
            default:
                System.out.println("Semaforul este defect.");
        }
    }
}
