import java.util.ArrayList;

public class Solution2 {

    public static void maxSubArray(int nums[]) {

        int N = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < N; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart;
                end = i;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }
        }

        // Extract the subarray from start to end
        ArrayList<Integer> maxList = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            maxList.add(nums[i]);
        }

        System.out.println("Max Sum : " + maxSum);
        System.out.println("Max SubArray : " + maxList);
    }

    public static void main(String[] args) {

        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubArray(nums);
    }
}
