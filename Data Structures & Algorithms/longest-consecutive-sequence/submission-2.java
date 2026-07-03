class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seq = new HashSet<>();
        int length = 1;
        int longest = 0;

        for(int num: nums){
            seq.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            if(!seq.contains(nums[i] - 1)){
                length = 1; 
                while(seq.contains(nums[i] + length)){
                length++;
            }
            }
           
            longest = Math.max(length,longest);
        }
        return longest;
        
    }
}
