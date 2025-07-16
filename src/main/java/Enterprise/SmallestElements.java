package Enterprise;

public class SmallestElements {
    public static int[] findTwoSmallest(int[] nums) {
        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("The array must contain at least two elements.");
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smallest) {
                secondSmallest = smallest;
                smallest = nums[i];
            } else if (nums[i] < secondSmallest && nums[i] != smallest) {
                secondSmallest = nums[i];
            }
        }

        return new int[]{smallest, secondSmallest};
    }
}
