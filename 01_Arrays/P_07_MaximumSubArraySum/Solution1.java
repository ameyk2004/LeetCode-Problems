class Solution1 {
    public int maxSubArray(int[] nums) {
        int N = nums.length;

        int maxi = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0; i<N; i++){

            sum = sum+nums[i];

            if(sum > maxi){
                maxi = sum;
            }

            if(sum <0){
                sum = 0;
            }
        }

        return maxi;
    }
}