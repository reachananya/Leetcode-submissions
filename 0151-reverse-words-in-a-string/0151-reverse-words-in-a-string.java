class Solution {
    public String reverseWords(String s) {
        Stack<String> st = new Stack<String>();
        
        
        for(String str : s.trim().split(" ")){
            if(!str.isEmpty()){
                st.push(str);
            }
            
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
            sb.append(" ");
        }
        
        return sb.toString().trim();
    }
}


/*
        for(char c : s.toCharArray()){
            while(c != ' '){
                sb.append(c);
            }
            String str = sb.toString();
            st.push(str);
        }
        
        Iterator val = st.iterator();
        
        while(val.hasNext()){
            ans.append(val);
        }
        
        return ans.toString();*/



/*
Stack<String> st = new Stack<String>();
        int n = s.length();
        int i = 0;
        
        while(i<n){
            //Getting rid of white spaces
            while(s.charAt(i) == ' ' && i<n){
                i++;
            }
            int start = i;
            
            while(s.charAt(i) != ' ' && i<n){
                if(i==n-1){
                    i = i + 0;
                }else{
                    i++;
                }                
            }
            
            if(i<n-1){
                st.push(s.substring(start, i));
            }else{
                st.push(s.substring(start, i+1));
            }
        }
        
        String ans = "";
        while(!st.empty()){
            ans = ans + st.peek();
            st.pop();
            //after every pop we want to add a space
            if(!st.empty()){
                ans += " ";
            }
        }
        return ans;
*/


/*
int i = 0;
        int j = s.length() - 1;
        
        StringBuffer string = new StringBuffer(s);
        
        for(i = 0; i<j; i++){
            char temp = s.charAt(i);
            string.setCharAt(i, s.charAt(j));
            string.setCharAt(j, temp);
            //s.replace(s.charAt(i), s.charAt(j));
            j--;
        }
        
        StringBuffer ans = new StringBuffer(string);
        int count = 0;
        
        for(i = 0; i<s.length() - 1; i++){
            count++; 
            if(s.charAt(i) == ' '){
                int m = i-1;
                int k = i-count + 1;
                while(k<=m){
                    char temp = s.charAt(m);
                    ans.setCharAt(m, s.charAt(k));
                    ans.setCharAt(k, temp);
                    k++;
                    m--;
                }  
            }
            count = 0;
        }
        return ans.toString();
*/