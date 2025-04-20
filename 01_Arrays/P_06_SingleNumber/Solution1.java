import java.util.HashMap;

class Solution1{

    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int num : nums){
            hashMap.put(num, 1+hashMap.getOrDefault(num, 0));
        }

        for(int key : nums){
            if(hashMap.getOrDefault(key, 0) == 1){
                return key;
            }
        }

    return 0;
    }
}