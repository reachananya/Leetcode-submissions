class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] timeStamp = new int[1001];
        
        for(int[] t : trips){
            timeStamp[t[1]] += t[0];
            timeStamp[t[2]] -= t[0];
        }
        
        for(int number : timeStamp){
            capacity = capacity - number;
            if(capacity < 0){
                return false;
            }
        }
        return true;
        
        
    }
}