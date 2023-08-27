package ArrayManipulation.TwoSumTarget;

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
}
