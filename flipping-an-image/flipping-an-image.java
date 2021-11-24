class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //Flipping it horizontally 
        
        //first element in the row -> [0][0] = [i][j]
        //last element in the row -> [0][3] = [i][k]
        for(int i = 0 ; i<image.length; i++){
            int j = 0;
            int k = image.length- 1;
            while(j<k){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                j++;
                k--;
            }
            
            //converting 0 -> 1 & 1 -> 0
            for(int a=0; a<image[i].length; a++){
                if(image[i][a] == 0){
                    image[i][a] = 1;
                }else{
                    image[i][a] = 0;
                }
            }
             
        }
        return image;
        
        
    }
}