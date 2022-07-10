class Solution {
    public boolean isPalindrome(String s) {
        String st = "";
        
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                st+=c;
            }
        }
        st = st.toLowerCase();
        
        int start = 0;
        int end = st.length()-1;
        
        while(start<=end){
            if(st.charAt(start) != st.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}