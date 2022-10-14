class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        s = s.toLowerCase();
        t = t.toLowerCase();
        
        int[] letters = new int[1<<8];
        
        for(char c: s.toCharArray()){
            letters[c]++;
        }
        
        for(char c: t.toCharArray()){
            letters[c]--;
        }
        
        for(int i : letters){
            if(i!=0) return false;
        }
        return true;
        
    }
}