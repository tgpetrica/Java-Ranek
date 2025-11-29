public class RepartizareClienti {
    public static void main(String[] args) {
        int[] clienti = {12, 4, 8, 5, 10, 5};
        int[] totalClientiMagazine = new int[3];

        //for (int i = 0; i < clienti.length; i++) {
        //    int indexMagazin = i % 3;
        //    totalClientiMagazine[indexMagazin] += clienti[i];
        //}

        int m = 0;
        for (int ora = 0; ora < clienti.length; ora++) {
            int nrClienti = clienti[ora];

            for (int i = 0; i < nrClienti; i++) {
                totalClientiMagazine[m]++;
                m = (m + 1) % 3;
            }
        }

        System.out.println("Numar total clienti Magazinul 0: " + totalClientiMagazine[0]);
        System.out.println("Numar total clienti Magazinul 1: " + totalClientiMagazine[1]);
        System.out.println("Numar total clienti Magazinul 2: " + totalClientiMagazine[2]);
    }
}
    