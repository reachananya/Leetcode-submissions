class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //interate through all the words
        //sort them
        //group them based on the indentical string 
        
        List<List<String>> grpanagram = new ArrayList<>();
        
        //as we need to keep a track of that 'this sorted array maps to these anagrams'
        
        HashMap<String, List<String>> hm = new HashMap<>();
        
        for(String curr : strs){
            char[] ch = curr.toCharArray();
            
            Arrays.sort(ch);
            
            String sorted = new String(ch);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(curr);
        }
        
        grpanagram.addAll(hm.values());
        return grpanagram;
    }
}

