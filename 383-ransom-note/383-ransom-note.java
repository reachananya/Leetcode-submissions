class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for(int j = 0; j<magazine.length(); j++){
            char ch = magazine.charAt(j);
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        
        for(int i=0; i<ransomNote.length(); i++){
            char ch1 = ransomNote.charAt(i);
            if(hm.containsKey(ch1)){
                hm.put(ch1, hm.get(ch1)-1);
                
                if(hm.get(ch1) == -1){
                    return false;
                }
            }else{
                return false;
            }
        }
        
        return true;
        
        
    }
}