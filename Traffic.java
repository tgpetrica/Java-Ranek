enum TrafficLight {
    RED, YELLOW, GREEN;

    private TrafficLight() {
        System.out.println("Constructor: " + this);
    }

    public void showAction() {
        switch(this) {
            case RED:
                System.out.println("Stop");
                break;
            case YELLOW:
                System.out.println("Warning");
                break;
            case GREEN:
                System.out.println("Go");
                break;
        }
    }
}

public class Traffic {
    public static void main(String[] args) {
        TrafficLight t = TrafficLight.RED;
        System.out.println(t);
        t.showAction();
    }
}
