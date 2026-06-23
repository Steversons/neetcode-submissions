class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        String sSorted = new String(sChars);
        String tSorted = new String(tChars);

        for(int i = 0; i < s.length();i++){
            if(sSorted.charAt(i) != tSorted.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
