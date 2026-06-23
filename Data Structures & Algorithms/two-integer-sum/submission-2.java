class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hashMap.put(nums[i],i);
        }

        for(int i = 0; i < nums.length; i++){
            int minuend = target - nums[i];
            if(hashMap.containsKey(minuend) && hashMap.get(minuend) != i){
                return new int[] {i,hashMap.get(minuend)};
            }
        }
        return new int[0];
        
    }
}
