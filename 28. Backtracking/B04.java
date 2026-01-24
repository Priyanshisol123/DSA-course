//N Queens problem
public class B04{
    public static boolean isSafe(char board[][],int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    // public static void nQueens(char board[][],int row){
    public static boolean nQueens(char board[][],int row){
         //bc
        if(row==board.length){
            // printBoard(board);
            count++;
            return true;
        }
        //column loop
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                if(nQueens(board,row+1)){
                    return true;
                }
                //nQueens(board,row+1);//function
                board[row][j]='X';//bactracking
                //board[row][j]='X';//bactracking
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("----------chess board---------");
        for(int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count;
    public static void main(String args[]){
        int n=5;
        char board[][]=new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(nQueens(board,0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
        // nQueens(board,0);
        // System.out.println("Total ways to solve nQueens = "+count);
    }
}