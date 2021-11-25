class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> finalList = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            if(i%3==0 && i%5==0){
                finalList.add("FizzBuzz");
            }else if(i%3==0){
                finalList.add("Fizz");
            }else if(i%5==0){
                finalList.add("Buzz");
            }else{
                finalList.add(Integer.toString(i));
            }
        }
        return finalList;
    }
}


/*
List<String> answer = new ArrayList<String>();    //we are creating an arraylist its just that it is part of an array that is why array<string> ans - new ArrayList<String>();
        
        for(int i=1; i<=n; i++){
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }
            else if(i%3==0){
                answer.add("Fizz");
            }
            else if(i%5==0){
                answer.add("Buzz");
            }else{
                answer.add(Integer.toString(i));
            }
        }
        return answer;
*/