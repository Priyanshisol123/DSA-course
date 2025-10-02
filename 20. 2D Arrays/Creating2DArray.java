import java.util.*;
public class Creating2DArray{
    //Searching in 2Darray
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("FOund at cell("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }

    //Creanting,storing and printing matrix/2Darray
    public static void main(String args[]){
        int matrix[][]=new int[3][3];
        Scanner sc = new Scanner(System.in);
        int n=matrix.length;//claculates the row
        int m=matrix[0].length;
        //matrix[0] takes to the 1st element 
        // then calculates the columns after that
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                //i=rows,j=cols
            }
        }
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
                //i=rows,j=cols
            }
            System.out.println();
        }

        //Searing function in matrix defined above
        search(matrix,5);
    }
}