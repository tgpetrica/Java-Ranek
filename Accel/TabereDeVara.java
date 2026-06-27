package Accel;

import javax.swing.ActionMap;

class Activitate {
    
    protected String numeActivitate;
    public Activitate(String numeActivitate) {
        this.numeActivitate = numeActivitate;
    }

    public void desfasurare() {
        System.out.println("Activitatea " + numeActivitate + " se desfasoara.");
    }
}

class Plaja extends Activitate {
    public Plaja (String numeActivitate) {
        super (numeActivitate);
    }

    @Override
    public void desfasurare() {
        System.out.println(numeActivitate + ": participantii inoata, se relaxeaza si stau la soare");
    }
}

class Drumetie extends Activitate {
    public Drumetie (String numeActivitate) {
        super (numeActivitate);
    }

    @Override
    public void desfasurare() {
        System.out.println(numeActivitate + ": participantii exploreaza muntele");
    }
}

class Festival extends Activitate {
    public Festival (String numeActivitate) {
        super (numeActivitate);
    }

    @Override
    public void desfasurare() {
        System.out.println(numeActivitate + ": participantii asculta muzica si danseaza la concerte");
    }
}

public class TabereDeVara {
    public static void main(String[] args) {
        Activitate a = new Activitate("tras cu arcul");
        System.out.println(a.numeActivitate);

        Activitate[] activitati = {
            new Plaja("Doua zile la mare"),
            new Drumetie("Urcare Postavaru"),
            new Festival("Seara de poveste la Nostalgia")
        };

        for (Activitate activitate : activitati) {
            System.out.print(activitate.getClass() + ": ");
            activitate.desfasurare();
        }
    }
}
