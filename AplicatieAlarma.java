interface Alarma {
    void pornesteAlarma();
}

public class AplicatieAlarma {
    public static void main(String[] args) {
        Alarma alarma = new Alarma(){
            @Override
            public void pornesteAlarma() {
                System.out.println("Atentie! Alarma activata.");
            }
        };

        alarma.pornesteAlarma();
    }   
}
