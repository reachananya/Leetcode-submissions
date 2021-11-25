//in strings always use charAt() and not sq brackets that is for lists

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(i<j && Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))){
                return false;
            }
        }
        return true;
            
        
    }
}

/*
int i = 0;
        int j = s.length() - 1;
        while(i<j){
            if(s.charAt(i) != ' ' && s.charAt(j) != ' '){
                if(s.charAt(i) == s.charAt(j)){
                    i++;
                    j--;
                    return true;
                }
                else{
                    return false;
                }
                
            }else if(s.charAt(i) == ' ' && Character.isLetterOrDigit(s.charAt(j))){
                i++;
            }else{
                j--;
            }
        }
        return true;
        
*/