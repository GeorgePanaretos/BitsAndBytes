package ArrayManipulation.TwoSumTarget;

import java.util.HashSet;
import java.util.Set;

public class TwoSumTarget {
    public static boolean hasTwoSum(int[] nums, int k) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == k) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean hashTwoSum(int[] nums, int k) {
        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : nums) {
            int diff = k - num;
            if (seenNumbers.contains(diff)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }
}
