package Enterprise;

public class Difference {

    public static int maxMinDifference(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");
        }

        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] < min)
                min = nums[i];
            if (nums[i] > max)
                max = nums[i];
        }
        return (max - min);
    }
}
