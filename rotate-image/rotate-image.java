class Solution {
    public void rotate(int[][] matrix) {
        
        //transpose matrix  
        int N = matrix.length;
        
        for(int i = 0; i<matrix.length; i++){
            for(int j = i; j<matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
            
            //flipping the elements in each row
        
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][N-1-j];
                matrix[i][N-1-j] = temp;
            }
            
        }
        
        
        
    }
}