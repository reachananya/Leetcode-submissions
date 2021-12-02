// Time complexity: O(N), N is number of elements in nums
// Auxiliary Space: O(N)
class Solution {
   public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> minQ = new ArrayDeque<>(), maxQ = new ArrayDeque<>();
       int right = 0, left = 0, n = nums.length;
       while(right < n){
           int rNum = nums[right];
//to ensure that minQ have minimum element as head             
           while(!minQ.isEmpty() && minQ.peekLast() > rNum) minQ.pollLast();
//to ensure that maxQ have maximum element as head                
           while(!maxQ.isEmpty() && maxQ.peekLast() < rNum) maxQ.pollLast();
           minQ.offerLast(rNum);
           maxQ.offerLast(rNum);
//In case max-min is greater than the limit slide the left side or window         
           if(maxQ.peekFirst() - minQ.peekFirst() > limit){
               if(minQ.peekFirst() == nums[left])minQ.pollFirst();
               if(maxQ.peekFirst() == nums[left])maxQ.pollFirst();
               left++;
           }
           right++;
       }
//return the length of the final sliding window         
       return right - left;
   }
}

/*
class Solution {
    public int longestSubarray(int[] nums, int limit) 
    {
        Deque<Integer> minQ = new ArrayDeque<>();
        Deque<Integer> maxQ = new ArrayDeque<>();
        int right = 0;
        int left = 0; 
        int n = nums.length;
        while(right < n){
            int rNum = nums[right];  //storing num at 0th index
            
            while(!minQ.isEmpty() && minQ.peekLast() > rNum){
                minQ.pollLast();
            }
            while(!maxQ.isEmpty() && maxQ.peekLast() < rNum){
                maxQ.pollLast();
                minQ.offerLast(rNum);
                maxQ.offerLast(rNum);
            }
            if(maxQ.peekFirst() - minQ.peekFirst() > limit){
               if(minQ.peekFirst() == nums[left])minQ.pollFirst();
               if(maxQ.peekFirst() == nums[left])maxQ.pollFirst();
               left++;
                
                
            }
            right++;
        }
        return right - left;
    }
}
*/