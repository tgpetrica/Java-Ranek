/*
    Factory
    - interface (cu metoda)
    - clase concrete (care implementeaza metoda)
    - clasa Factory care are o metoda:
        - returneaza tipul obiectului
        - are un parametru String
*/

// Enemy: Small, Medium, Big
//1139

interface Enemy {
    void attack();
}

class SmallEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("the small enemy attacks me; damage: 5");
    }
}

class MediumEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("the medium enemy attacks me; damage: 20");
    }
}

class BigEnemy implements Enemy {
    @Override
    public void attack() {
        System.out.println("the big enemy attacks me; damage: 50");
    }
}

public class EnemyFactory {
    public Enemy getEnemy (String type) {
        if (type == null) return null;
        if (type.equalsIgnoreCase("small")) return new SmallEnemy();
        if (type.equalsIgnoreCase("medium")) return new MediumEnemy();
        if (type.equalsIgnoreCase("big")) return new BigEnemy();
        return null;
    }

    public static void main(String[] args) {
        EnemyFactory ef = new EnemyFactory();
        Enemy e1 = ef.getEnemy("small");
        e1.attack();

        Enemy e2 = ef.getEnemy("mediUm");
        e2.attack();

        Enemy e3 = ef.getEnemy("Big");
        e3.attack();
    }
}

