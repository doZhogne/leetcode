package easy;

public class TwoSum {
    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */

    public static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];

        try {
            if (nums.length % 2 == 1) throw new Exception();

            for (int x = 0; x < nums.length - 1; x += 2) {
                for (int y = 1; y < nums.length; y += 2) {
                    if (nums[x] + nums[y] == target) {
                        indices[0] = x;
                        indices[1] = y;
                    }
                }
            }
        } catch (Exception e) {

        }
        return indices;
    }
}
