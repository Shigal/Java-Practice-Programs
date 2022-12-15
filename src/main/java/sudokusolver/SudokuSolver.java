package sudokusolver;/*
 *
 * @author Lawshiga
 *
 */

import java.util.Random;

public class SudokuSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {7, 0, 2, 0, 5, 0, 6, 0, 0},
                {0, 0, 0, 0, 0, 3, 0, 0, 0},
                {1, 0, 0, 0, 0, 9, 5, 0, 0},
                {8, 0, 0, 0, 0, 0, 0, 9, 0},
                {0, 4, 3, 0, 0, 0, 7, 5, 0},
                {0, 9, 0, 0, 0, 0, 0, 0, 8},
                {0, 0, 9, 7, 0, 0, 0, 0, 5},
                {0, 0, 0, 2, 0, 0, 0, 0, 0},
                {0, 0, 7, 0, 4, 0, 2, 0, 3}
        };

        printBoard(board);

        if(solveBoard(board)) {
            System.out.println("Solved successfully");
        } else{
            System.out.println("Unsolvable board");
        }

        printBoard(board);

    }

    private static void printBoard(int[][] board) {
        for(int row = 0; row<GRID_SIZE; row++) {
            if(row % 3 ==0 && row != 0) {
                System.out.println("-----------");
            }
            for(int col=0; col<GRID_SIZE;col++) {
                if(col % 3 == 0 && col !=0) {
                    System.out.printf("|");
                }
                System.out.print(board[row][col]);
            }
            System.out.println();
        }
    }

    // check with board passing in itself, the number we are checking, the row number we are checking
    private static boolean isNumberInRow(int[][] board, int number, int row){
        for(int i=0; i<GRID_SIZE; i++) {
            if(board[row][i] == number) {
                return true;
            }
        }
        return false;
    }

    private static boolean isNumberInCol(int[][] board, int number, int col){
        for(int i=0; i<GRID_SIZE; i++) {
            if(board[i][col] == number) {
                return true;
            }
        }
        return false;
    }

    // check for number in 3x3 boxes
    private static boolean isNumberInBox(int[][] board, int number,int row, int col){
        int localBoxRow = row - row % 3; // starting index of localbox row
        int localBoxCol = col - col % 3; // starting index of localbox col

        for(int i=localBoxRow; i<localBoxRow + 3; i++) {
            for(int j=localBoxCol; j<localBoxCol + 3; j++) {
                if(board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    // method to check to all three conditions at a time
    private static boolean isValidPlacement(int[][] board, int number, int row, int col){
        return !isNumberInRow(board, number, row) &&
                !isNumberInCol(board, number, col) &&
                !isNumberInBox(board, number, row, col);
    }

    // we first check if the number 1 is a valid number check the row, col and box
    // if yes place it then move to the next empty space and try with 2 as 1 is already placed
    // if that gives conflicts we back track and go to the previous blank space and try 2 and so on there
    private static boolean solveBoard(int[][] board) {
        for(int row=0; row<GRID_SIZE; row++) {
            for(int col=0; col<GRID_SIZE; col++) {
                if(board[row][col] == 0) {
                    // loop through all the numbers from 1 to 9
                    for(int numberToTry=1; numberToTry<=GRID_SIZE; numberToTry++){
                        if(isValidPlacement(board, numberToTry, row, col)){
                            board[row][col] = numberToTry;
                            // here comes the recursion
                            // solve the game by passing in the same board again
                           if(solveBoard(board)){
                               return true;
                           } else{
                               // couldn't solve the board with the number that we are trying as we moven on
                               // set it back to 0 as we can't solve the rest of the board with this number
                               board[row][col] = 0;
                           }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
