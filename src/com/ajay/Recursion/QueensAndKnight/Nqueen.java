package com.ajay.Recursion.QueensAndKnight;

import java.util.Arrays;

public class Nqueen {
    public static void main(String[] args) {
        boolean[][] board = {{true, true, true, true},
                             {true, true, true, true},
                             {true, true, true, true},
                             {true, true, true, true}};
/*
        int size = 4;
        boolean[][] board2 = new boolean[size][size];
        Here in above 2D array every value will be false, code I have written considering initially all Array elements are true. So you
        cannot use above input.
        int x = queen(board2, 0);
        System.out.println(x);
*/
        System.out.println(queen(board,0));
    }
    static int queen(boolean[][] board, int row){
        if(row == board.length) {
            for (boolean[] arr : board) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == false) {
                        System.out.print("Q  ");
                    }
                    else {
                        System.out.print("X  ");
                    }
                }
                System.out.println();
            }
            return 1;
        }
        int count = 0;
        for(int col=0; col<board[0].length;col++){
            if(isSafe(board, row, col)){
               board[row][col] = false;
               count = count + queen(board, row+1);
               board[row][col] = true;
            }
        }
        return count;
    }
    static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col] == false){
                return false;
            }
            int maxLeft = Math.min(row, col);
            for (int j=1; j<=maxLeft; j++){
                if(board[row-j][col-j] == false){
                    return false;
                }
            }
            int maxRight = Math.min(row, board[0].length-1-col);
            for(int k=1; k<=maxRight; k++){
                if(board[row-k][col+k] == false){
                    return false;
                }
            }
        }
        return true;
    }

}
