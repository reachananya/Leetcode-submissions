class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        //Flipping it horizontally 
        
        //first element in the row -> [0][0] = [i][j]
        //last element in the row -> [0][3] = [i][k]
        for(int i = 0 ; i<image.length; i++){
            int j = 0;
            int k = image[i].length- 1;
            while(j<k){
                int temp = image[i][j];
                image[i][j++] = image[i][k];
                image[i][k--] = temp;
            }
            
            //converting 0 -> 1 & 1 -> 0
            for(int a=0; a<image[i].length; a++){
                image[i][a] = image[i][a] == 1 ? 0 : 1;
            }
             
        }
        return image;
        
        
    }
}