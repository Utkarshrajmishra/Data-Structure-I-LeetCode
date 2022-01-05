class Solution {
    public boolean isValidSudoku(char[][] board) {
                int[] boards = new int[9];

        for(int i=0;i<board.length;i++){
            int bitMaskRow=0;
            int bitMaskCol=0;

            for(int j=0;j<board[i].length;j++){
                
                if(board[i][j]!='.' && (bitMaskRow&(1<<(board[i][j]-'0'))) > 0){
                    return false;
                }
                
                if(board[j][i]!='.' && (bitMaskCol&(1<<(board[j][i]-'0'))) > 0){
                    return false;
                }
                
                if(board[i][j]!='.' && (boards[calcIndexOfBoard(i,j)] & (1<<(board[i][j]-'0'))) >0){
                    return false;
                }
                if(board[i][j]!='.'){
                boards[calcIndexOfBoard(i,j)]|=(1<<(board[i][j]-'0'));
                bitMaskRow|=(1<<(board[i][j]-'0'));
                }
                if(board[j][i]!='.')
                bitMaskCol|=(1<<(board[j][i]-'0'));
            }      
        }
        
        return true;
    }
    
    public int calcIndexOfBoard(int i, int j){
       return  (i / 3) * 3 + j / 3;

    }
}
