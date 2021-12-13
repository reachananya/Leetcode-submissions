class Solution {
    public int[] char_map;  //store our alien lang 
    public boolean isAlienSorted(String[] words, String order) {
        char_map = new int[26];
        for(int i = 0; i<order.length(); i++){
            char_map[order.charAt(i) - 'a'] = i;
        }
        
        for(int i = 1; i<words.length; i++){
            if(compare(words[i-1], words[i] ) > 0){  //it is not sorted 
                return false; 
            }
            
        }
        return true;
         
    }
    
    public int compare(String word1, String word2){
        //comparison of word 1 and word 2
        int i = 0; 
        int j = 0; 
        int comp = 0;   //the value that needs to be returned and setermine of its +ve or -ve
        while(i<word1.length() && j <word2.length() && comp == 0){
            // if comp ==0 that means 
            //just looping through both the words
            comp = char_map[word1.charAt(i) - 'a'] - char_map[word2.charAt(j) - 'a'];
            i++;
            j++;
        }
        
        if(comp == 0){
            return word1.length() - word2.length();   //this will return a positive value which we clearly don't want {"hello", "hel"}
        }
        else{
            return comp;
        }
        
        
        
        
    }
    
}
