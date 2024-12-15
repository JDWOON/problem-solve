package leetcode;

public class Solution {
    public int countBattleships(char[][] board) {
        int x = board.length;
        int y = board[0].length;
        int cnt = 0;
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++){
                if(board[i][j] =='X'){
                    if(i<x-1 && board[i+1][j] =='X'){
                        for(int k=i; k<x && board[k][j]=='X'; k++){
                            board[k][j]='.';
                        }
                        cnt++;
                    }else if(j<y-1 && board[i][j+1] =='X'){
                        for(int k=j; k<y && board[i][k]=='X'; k++){
                            board[i][k]='.';
                        }
                        cnt++;
                    }else{
                        board[i][j]='.';
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}