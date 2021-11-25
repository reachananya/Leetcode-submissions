class Solution {
    public boolean containsDuplicate(int[] nums) {
        //creating a HashSet 
        HashSet <Integer> addingVal = new HashSet<>();
        
        for(int i :nums){
            if(addingVal.contains(i)){
                return true;
            }else{
                addingVal.add(i);
            }
        }
        return false;
    }
}