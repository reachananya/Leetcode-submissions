class Solution {
    public boolean backspaceCompare(String s, String t) {
        //traversing through s
        //Using stacks
        Stack<Character> mainSt = new Stack<Character>();
        Stack<Character> mainTt = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch != '#'){
                mainSt.push(ch);
            }else if(!mainSt.isEmpty()){
                mainSt.pop();
            }

        }
        for(char ch : t.toCharArray()){
            if(ch != '#'){
                mainTt.push(ch);
            }else if(!mainTt.isEmpty()){
                mainTt.pop();
            }
            
        }
        //comparison
        
        while(!mainSt.isEmpty()){
            char current = mainSt.pop();
            if(mainTt.isEmpty() || mainTt.pop() != current){
                return false;
            }
        }
        
        return (mainSt.isEmpty() && mainTt.isEmpty());
        
    }
}