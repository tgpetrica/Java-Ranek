public class Label {
    public static void main(String[] args) {
        int i = 1;

        loop: while (i <= 5) {
            if (i == 2) {
                i++;
                continue loop;
            }

            if (i == 4) {
                break loop;
            }

            System.out.println(i);
            i++;
        }
    }
}
