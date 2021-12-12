class Solution {
    public int climbStairs(int n) {
        // remebering how many subproblems we need to solve 
        // using the Bottom UP approach in Dynamic Programming 
        // Starting from the base case 
        int[] dp = new int[n+1];
        dp[0] = 1;  // represents the number of ways to climb 0 steps i.e 1 (u don't clumb it)
        dp[1] = 1;  // climbing only 1 step 
        for(int i = 2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
            
        }
        return dp[n];
    }
}