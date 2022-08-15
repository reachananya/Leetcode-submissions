import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        //arrangint it in descending order then find that particular number 
        // using BigInteger and minHeap
        
        //BigInteger[] arr = new BigInteger[nums.length];
        
        PriorityQueue<BigInteger> arr = new PriorityQueue<BigInteger>();
        
        for(int i = 0; i<nums.length; i++){
            arr.add(new BigInteger(nums[i]));
            
             if(arr.size()>k){
                 arr.poll();
             }
            
            
        }
        
       
        
        return String.valueOf(arr.peek());
        
       
            
            
        
    }
}