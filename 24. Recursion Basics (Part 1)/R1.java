// print numbers in decreasing order
import java.util.*;
public class R1{
    //rucursion function
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }

    public static void main(String args[]){
        int n=10;
        printDec(n);
    }
}