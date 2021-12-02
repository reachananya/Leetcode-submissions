class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor){
            return image;
        }
        
        bfs(image, sr, sc, image[sr][sc], newColor); 
        return image;
        
    }
    
    public void bfs(int[][] image, int i, int j , int color, int newColor){
            //checking corner cases
        if(i<0 || i>=image.length || j<0 || j>=image[i].length || image[i][j] != color){
            return;
        }
        
        image[i][j] = newColor;
        
        bfs(image, i+1, j, color, newColor);
        bfs(image, i-1, j, color, newColor);
        bfs(image, i, j+1, color, newColor);
        bfs(image, i, j-1, color, newColor);
        
    }
    
}