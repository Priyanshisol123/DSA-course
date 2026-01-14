//Print Factorial of a number n
import java.util.*;
public class R3{
    public static int intFact(int n){
        if(n==0){
            return 1;
        }
        int fnm1=intFact(n-1);
        int fn=n*intFact(n-1);
        return fn;
    }
    public static void main (String arg[]){
        System.out.println(intFact(5));
    }
}