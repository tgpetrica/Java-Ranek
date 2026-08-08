package triplets;

public class Nested3 {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7 };
        int target = 7;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        System.out.println("(" + nums[i] + " " + nums[j] + " " + nums[k] + ")");
                    }
                }
            }
        }
    }
}
