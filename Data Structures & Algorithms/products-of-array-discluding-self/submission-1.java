class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int products = 1;
        int zeros = 0;
        for(int num: nums){
            if(num != 0){
                products = products * num;
            } else {
                zeros++;
            }
        }
        if(zeros > 1){
            return new int[n];
        }
        int[] results = new int[n];
        for(int i = 0; i < n; i++){
            if(zeros > 0){
                results[i] = (nums[i] == 0) ? products : 0; 
            } else{
                results[i] = products/nums[i];
            }
        }
        return results;
        
    }
}  
