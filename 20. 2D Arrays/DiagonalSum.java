import java.util.*;
public class DiagonalSum{
    public static int diagonalSum(int matrix[][]){
        int sum=0;
    /*
    Brute Force

        //tc=O(n^2)
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                //primary diagonal
                if(i==j){
                    sum+=matrix[i][j];
                }
                //secondary diagonal
                if(i+j==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
    */
        //tc=O(n) linear best tc
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if (i!=matrix.length-1-i){
                sum+=matrix[i][matrix.length-i-1];
            }
            //here since i+j=n-1 we use j=n-i-1
            //also, here the condition of middle 
            // element will over lap as 
            // (n-i-1) = i for i=1 so to exclude
            //  we used if condition
        }
        return sum;
    }
    public static void main (String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.println("Sum="+diagonalSum(matrix));

    }
}