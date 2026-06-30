class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder result = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for(String s:strs){
            sizes.add(s.length());
        }
        for(int s:sizes){
            result.append(s).append(',');
        }
        result.append('/');
        for(String s:strs){
            result.append(s);
        }
        return result.toString();

    }

    public List<String> decode(String str) {
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;

        while(str.charAt(i) != '/'){
            StringBuilder curr = new StringBuilder();
            while(str.charAt(i) != ','){
                curr.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(curr.toString()));
            i++;
        }
        i++;
        for(int s:sizes){
            result.add(str.substring(i,i+s));
            i+=s;
        }
        return result;
    }
}
