class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length; i++){
            int difference = target - nums[i];
            if(hm.containsKey(difference)){
                res[0] = i;
                res[1] = hm.get(difference);   //hm.get(difference)
                return res;
            }
            hm.put(nums[i], i);
        }
        return res;
    }
}

/*
int[] res = new int[2];
        for(int i : nums){
            for(int j = 1; j<nums.length; j++){
                if(nums[i] + nums[j] == target){
                    res[0] = i;
                    res[1] = j;
                }
            }
            i++;
        }
        return res;
*/