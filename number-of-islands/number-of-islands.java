class Solution {
    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        int numofIstalnds = 0;
        
        //traversing the whole grid 
        for(int i =0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numofIstalnds = numofIstalnds + gridTraversal(i, j, grid);
                }
            }
        }
        return numofIstalnds;
        
    }
    public int gridTraversal(int i, int j, char[][] grid){
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
            return 0;
        }
        grid[i][j] = '0';
        gridTraversal(i+1, j, grid);
        gridTraversal(i-1, j, grid);
        gridTraversal(i, j-1, grid);
        gridTraversal(i, j+1, grid); 
        return 1;
    }
       
}


/*
// 1. error checking -> creating an edge case 
        if(grid == null || grid.length == 0){
            return 0;
        }
        
        // 2. Since we need the number of islands we can take up and int and initialize the same 
        int numOfIslands = 0;
        
        //3. Traversing the whole grid by using a nested loop
        
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == '1'){
                    numOfIslands += checkCase(grid, i , j);  
                }
            }
        }
        return numOfIslands;
    }
    
    public int checkCase(char[][] grid, int i, int j)
    {
            //error checking that value of i, j doesn't go beyond the grid
        if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0'){
                return 0;
        }
            
        //grid[i][j] == '0' shows that we are not interested in 0 so that means we will lonly get 1
            
            //sinking the adjacent 1s
        grid[i][j] = '0';
            //moving horizontally/vertically from where our pointer is atm
        checkCase(grid, i+1, j);
        checkCase(grid, i-1, j);
        checkCase(grid, i, j+1);
        checkCase(grid, i, j-1);    
        //after sunking we will return the cunt of islands we got i.e will be 1
        return 1;
*/