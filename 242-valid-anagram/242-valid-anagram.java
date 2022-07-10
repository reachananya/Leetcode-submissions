class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> mp = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            //tells that teh character is not their in the map 
            if(mp.get(s.charAt(i)) == null){
                mp.put(s.charAt(i), 1);
            }else{
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            }
        }
        
        //now we will compare the string t with teh map mp
        for(int j = 0; j<t.length(); j++){
            if(mp.get(t.charAt(j)) == null || mp.get(t.charAt(j)) == 0) return false;
            mp.put(t.charAt(j), mp.get(t.charAt(j)) -1);
        }
        return true;
    }
}