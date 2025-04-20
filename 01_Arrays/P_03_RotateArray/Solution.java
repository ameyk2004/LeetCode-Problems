// Problem Link : https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

class Solution {
    public boolean check(int[] nums) {
        int count = 1;
        int N = nums.length;

        for(int i=1;i<2*N;i++){

            if(count == N)
                return true;

            if(nums[(i-1) % N] <= nums[i%N]){
                count = count+1;
            }
            else count = 1;
        }

        return false;
    }  
}
