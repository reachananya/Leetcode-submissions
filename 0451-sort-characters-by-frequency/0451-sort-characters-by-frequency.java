class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        for(char c : s.toCharArray()){
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        
        //creating the multistorage bucket with size s,length() + 1
        List<Character>[] bucket = new List[s.length() + 1];
        
        for(char key : hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq] == null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int pos = bucket.length - 1; pos >= 0; pos--){
            if(bucket[pos]!= null){
                for(char c : bucket[pos]){
                    for(int i = 0; i<pos; i++){
                        sb.append(c);
                    }
                }
            }
        }
        return sb.toString();
        
        
        
        
    }
}


/*
StringBuilder sb = new StringBuilder();
        int[] freq = new int[256];
        
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        
        int noOfBucktes = Math.sqrt(s.length());
        int bucketRange = globalMax - globalMin;
        
        //Creating a multi storage bucket with size s.lenth() + 1
        List<Integer>[] buckets = new List[s.length() + 1];
        
        //Adding the characters based on their frequency 
        
        for(char ch : )
        
        
        
        
        
        //Initializing the buckets as linkedlists 
        for(int i = 0; i<noOfBucktes; i++){
            buckets[i] = new LinkedList<>();
        }
        
        //inserting the numbes in the buckets 
        
        for(int num: freq){
            buckets[hash(num, bucketRange, noOfBucktes)].add(num);
        }
        
        //Sorting the numbers inside the bucket
        
        for(List<Integer> values : buckets){
            Collections.sort(values);
        }
*/