class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;

        for(int num : nums){
            if(num == 1){
                count += 1;
            }
            else{
                count = 0;
            }
            if(count > maxCount){
                maxCount = count;
            }
                
        }
        return maxCount;
    }
}