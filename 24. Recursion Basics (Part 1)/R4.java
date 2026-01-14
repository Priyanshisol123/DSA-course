//Print sum of first n natural numbers
import java.util.*;
public class R4{
    public static int calcSum(int n){
        if(n==1){
            return 1;
        }
        int Snm1=calcSum(n-1);
        int Sn=n+Snm1;
        return Sn;
    }
    public static void main (String args[]){
        System.out.println(calcSum(5));
    }
}