enum Directions {
    NORTH, EAST, SOUTH, WEST;

    public Directions opposite() {
        switch(this) {
            case NORTH: return SOUTH;
            case EAST: return WEST;
            case SOUTH: return NORTH;
            case WEST: return EAST;
            default: return NORTH; // exception
        }
    }
}

public class OppositeCardinal {
    public static void main(String[] args) {
        for (Directions dir : Directions.values()) {
            System.out.println(dir + " -> " + dir.opposite());
        }
    }
}
