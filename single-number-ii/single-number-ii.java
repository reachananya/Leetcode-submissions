class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // key, values
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        } 
        
        for(int key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}