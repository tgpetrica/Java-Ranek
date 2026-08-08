package triplets;
import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] nums = { 1, 6, 3, 0, 8, 4, 1, 7, -2, -4, 0, 12, 2, 3, 4, 5, 6, 1, 5, 8, 3, 2, 8 };
        int target = 6;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            
            int inf = i + 1;
            int sup = nums.length - 1;

            while (inf < sup) {
                int sum = nums[i] + nums[inf] + nums[sup];

                if (sum == target) {
                    System.out.println("(" + nums[i] + " " + nums[inf] + " " + nums[sup] + ")");
                    inf++;
                    sup--;
                

                    while (inf < sup && nums[inf] == nums[inf - 1]) {
                        inf++;
                    }

                    while (inf < sup && nums[sup] == nums[sup + 1]) {
                        sup--;
                    }
                } else if (sum < target) {
                    inf++;
                } else {
                    sup--;
                }
            }
        }
    }
}
