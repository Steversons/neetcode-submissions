class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> group = new HashMap<>();
        for(String str:strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            group.putIfAbsent(sorted, new ArrayList<>());
            group.get(sorted).add(str);
        }
        return new ArrayList<>(group.values());
        
    }
}
