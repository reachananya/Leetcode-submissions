class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] chars = new int[128];
        
        int left = 0;
        int right = 0;
        
        int res = 0;
        
        while(right < s.length()){
            char r = s.charAt(right);
            chars[r]++;
            
            while(chars[r] > 1){
                char l = s.charAt(left);
                chars[l]--;
                left++;
            }
            
            res = Math.max(res, right - left + 1);
            
            right++;
        }
        return res;
    }
    
}

/*
GOOD SOL 
int n = s.length();
        int res = 0;
        
        for(int i = 0; i<n; i++){
            boolean[] visited = new boolean[256];
            
            for(int j = i; j<n; j++){
                if(visited[s.charAt(j)] == true){
                    break;
                }else{
                    res = Math.max(res, j - i + 1);
                    visited[s.charAt(j)] = true;
                }
            }
            //visited[s.charAt(i)] = false;
        }
        return res;

*/


/*
//initializing the return var
        int maxLength = 0;
        
        for(int i = 0; i<s.length(); i++){
            for(int j  = i; j<s.length(); j++){
                if(areUnique(s, i, j) == true){
                    maxLength = Math.max(maxLength, j-i+1);
                }
            }
        }
        return maxLength;  
    }
    public boolean areUnique(String s, int i, int j){
        int[] visited = new int[256]; 
        
        for(int k = i; k<s.length(); k++){
            if(visited.charAt(s.charAt(k)) == true){
                //that means its already visited hence, we will make it false
                return false;
            }else{
                visited[s.charAt(k)] = true;
            }
            
        }
        return true;
*/