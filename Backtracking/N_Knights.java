package com.Recursion;

public class N_Knights {
    public static void main(String[] args) {
        System.out.println(knights(new boolean[3][3],0,0,4));

    }
    static int knights(boolean [][]board,int r,int c,int target){
        if(target==0){
            display(board);
            return 1;
        }
        if(c==board.length){

            return knights(board,r+1,0,target);
        }
        if(r==board.length){
            return 0;
        }
        int count=0;
        if(isSafe(board,r,c)){
            board[r][c]=true;
            count =count +knights(board,r,c+1,target-1);
            board[r][c]=false;
        }
        count+=knights(board,r,c+1,target);
        return count;
    }
    static boolean isSafe(boolean [][]board,int r,int c){
        if(isValid(board,r-2,c+1)){
            if(board[r-2][c+1]){
                return false;
            }
        }
        if(isValid(board,r-2,c-1)){
            if(board[r-2][c-1]){
                return false;
            }
        }
        if(isValid(board,r-1,c+2)){
            if(board[r-1][c+2]){
                return false;
            }
        }
        if(isValid(board,r-1,c-2)){
            if(board[r-1][c-2]){
                return false;
            }
        }
        return true;
    }
    static boolean isValid(boolean [][]board,int r,int c){
        if(r>=0 && r<board.length && c>=0 && c<board.length){
            return true;
        }
        return false;
    }
    static void display(boolean[][]board){
        for(boolean[]row:board){
            for(boolean elem:row){
                if(elem){
                    System.out.print("K ");
                }else{
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }
}
