import java.math.BigInteger;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        //arrangint it in descending order then find that particular number 
        
        BigInteger[] arr = new BigInteger[nums.length];
        
        for(int i = 0; i<nums.length; i++){
            arr[i] = new BigInteger(nums[i]);
        }
        
        Arrays.sort(arr);
        
        BigInteger res = arr[arr.length-k];
        
        return res.toString();
        
    }
}