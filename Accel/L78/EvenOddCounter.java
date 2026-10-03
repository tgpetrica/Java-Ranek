package Accel.L78;
import java.util.Scanner;

public class EvenOddCounter {
    // citesc un int[] => cate pare, cate impare
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cate numere citesti? ");
        int limit = scanner.nextInt();

        int[] nums = new int[limit];

        System.out.println("Introdu numerele: ");
        for (int i = 0; i < limit; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] counts = countEvenOdd(nums);
        System.out.println("Even: " + counts[0]);
        System.out.println("Odd: " + counts[1]);

        scanner.close();
    }

    static int[] countEvenOdd(int[] nums) {
        if (nums == null) {
            return new int[]{0, 0};
        }

        int evenCounter = 0;
        int oddCounter = 0;

        for (int num : nums) {
            if (num % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }

        return new int[]{evenCounter, oddCounter};
    } 
}
