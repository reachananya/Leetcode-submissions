class Solution {
    public boolean isValid(String s) {
        Stack<Character> qu = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(c =='(' || c == '[' || c =='{')
            {   //All are front brackets that means we can ad them into the qu
                qu.push(c);
            }
            else if( c ==')' && !qu.isEmpty() && qu.peek() == '(')
                qu.pop();
            else if( c ==']' && !qu.isEmpty() && qu.peek() == '[')
                qu.pop();
            else if( c =='}' && !qu.isEmpty() && qu.peek() == '{')
                qu.pop();
            else{
                return false;
            }
        }
        return qu.isEmpty();
    }
}