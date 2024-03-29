class Solution {
    public int countBattleships(char[][] board) {
        //traversing the matrix
        int noBattleShips = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j<board[i].length; j++){
                if(board[i][j] == 'X'){
                    noBattleShips++;
                    sink(board, i, j);
                }
            }
        }
        return noBattleShips;
        
    }
    
    //recursion 
    public void sink(char[][] board, int i , int j){
        if(i<0 || i>=board.length || j<0 || j>=board[i].length || board[i][j] == '.'){
            return;
        }
            
            //in order to sink it we will change its value from "x" to "."
            
        board[i][j] = '.';
        sink(board, i-1, j);
        sink(board, i+1, j);
        sink(board, i, j+1);
        sink(board, i, j-1);
            
        
    }
}