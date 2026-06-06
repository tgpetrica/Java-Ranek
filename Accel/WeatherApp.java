package Accel;
import java.util.Scanner;
//import java.util.ArrayList;
import java.util.HashMap;
public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate orase vrei sa citesti?");
        int oraseCitite = sc.nextInt();
        sc.nextLine();
        //ArrayList<String> numeOrase = new ArrayList<>();
        HashMap<String, int[]> temperaturiOrase= new HashMap<>();
        for(int i = 1;i<=oraseCitite;i++){
            System.out.print("Introdu nume oras:");
            String numeOras = sc.nextLine();
            int[] temperaturi = new int[7];
            for (int j = 0; j < 7; j++) {
                System.out.print(" Ziua: " + (j+1)+": ");
                temperaturi[j] = sc.nextInt();
            }
            sc.nextLine();
            temperaturiOrase.put(numeOras, temperaturi);
        }
        afisare(temperaturiOrase);
        
    }
    public static double mediaTemperatura(int[] temperaturi){
        double sum = 0;
        for(int i = 0; i < 7; i++){
            sum += temperaturi[i];
        }
        return sum / 7;
    }
    public static void afisare(HashMap<String,int[]> medieOras){
        for(String oras : medieOras.keySet()){
            int[] tempOras = medieOras.get(oras);
            double medOras = mediaTemperatura(tempOras);
            System.out.println(oras + ":" + medOras);
        }
    }
}
