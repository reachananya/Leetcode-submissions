//sliding window question 

class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0, j = 0, n = s.length();
        
        //create a hashmap to store the char and their freq
        HashMap<Character, Integer> hm = new HashMap<>();
        
        int ans = 0;
        
        while(j<n){
            hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) + 1);         
                /*
                hm <Character, Integer> // Integer-> count of that character 
                // whenever we want to automatically add +1 and keep the count of a character we use 
                getOrDefault
                hm.put(s.charAt(i), getOrDeafault(key , DefaultValue))
                DefaultVaule -> 0
                otherwise add +1
                hm.put(s.charAt(i), getOrDeafault(s.charAt(i) , 0) + 1) 
                */
            
            //Collections -> automatically refers to the hm since we are putting hm.values()
            
            int maxFreq = Collections.max(hm.values());   //returns the max value in our hm
            
            /*
                 j - i + 1 - maxFreq -> 
            */
            while(j - i + 1 - maxFreq > k){  //will shift  i pointer 
                hm.put(s.charAt(i) , hm.get(s.charAt(i)) - 1);
                i++;
            }  
            
            ans = Math.max(ans, j - i + 1);
            j++;
         
        }
        return ans;
    }
}



/*
int n = s.length();
        //keeping track of the repeating characters 
        int[] char_count = new int[26]; 
        //at index 0, how many 0 are there then at index 1 how many B's are there. 
        //keeps a count of repleating characters 
        
        int i = 0;
        
        int max_length();
        
        //the operation gets finished when k touches 0. 
        //k>0 should be the condition 
        
        for(j = 0; j<s.length; j++){
            char_count[s.charAt(j) - 'A']++;
            while(k>0){
                i++;
                
            }
        }
        return max_length();
*/