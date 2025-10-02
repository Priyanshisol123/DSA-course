import java.util.*;
public class Q1OddEven{
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        oddOrEven(n);
    }
}