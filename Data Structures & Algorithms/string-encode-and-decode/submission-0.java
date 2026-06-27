class Solution {

    public String encode(List<String> strs) {
        //Empty case
        if(strs.isEmpty()) return "";
        //Uses StringBuilder because normal strings are immutable. Allows for appends.
        StringBuilder result = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();
        //Adding the size of each word into an array list of sizes.
        for(String str: strs){
            sizes.add(str.length());
        }
        //Adds a comma between each size of the word in order to separate the sizes
        for(int size:sizes){
            result.append(size).append(',');
        }
        //Creates a delimiter in order to signify where the words begin and the numbers end.
        result.append('/');
        for(String str:strs){
            result.append(str);
        }
        //Returns answer as strings for decoding
        return result.toString();
    }

    public List<String> decode(String str) {
        //Empty case
        if(str.length() == 0){
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();
        int i = 0;
        //Loops until it finds the seperation between the sizes and the words.
        while(str.charAt(i) != '/'){
            StringBuilder current = new StringBuilder();
            //Loops until it finds the seperation between the sizes. Adds the size to the word.
            while (str.charAt(i) != ','){
                current.append(str.charAt(i));
                i++;
            }
            //Converts the size into an integer. Adds it to the size array list.
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        //Adds each word into the array list based on the size.
        for(int s:sizes){
            result.add(str.substring(i,i+s));
            i+=s;
        }
        return result;


    }
}
