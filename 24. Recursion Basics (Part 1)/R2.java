// print numbers in increasing order
import java.util.*;
public class R2{
    public static void printInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        //print hone se pehle hi call ho raha hai so it
        // doesnt print anything untiln goes to 1 and when 
        // n becomes 1 then it prints 1
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        printInc(10);
    }
}