package triplets;
import java.util.HashSet;

public class HashSet3 {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int target = 7;

        for (int i = 0; i < nums.length - 2; i++) {
            HashSet<Integer> checked = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int diff = target - nums[i] - nums[j];

                if (checked.contains(diff)) {
                    System.out.println("(" + nums[i] + " " + diff + " " + nums[j] + ")");
                }

                checked.add(nums[j]);
            }
        }
    }
}
