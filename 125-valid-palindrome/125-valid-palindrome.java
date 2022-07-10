class Solution {
    public boolean isPalindrome(String s) {
        String st = "";
        
        for (char c : s.toCharArray()){
            if( Character.isLetter(c) || Character.isDigit(c)){
                st = st+c;
            }
            
        }
        st = st.toLowerCase();
        int start = 0;
        int end = st.length()-1;
        
        while(start <= end){
            if(st.charAt(start) != st.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
        
    }
}