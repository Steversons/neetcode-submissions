class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        Arrays.sort(sChar);
        Arrays.sort(tChar);
        String sSorted = String.valueOf(sChar);
        String tSorted = String.valueOf(tChar);

        for(int i = 0; i < s.length();i++){
            if(sSorted.charAt(i) != tSorted.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
