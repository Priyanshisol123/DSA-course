//Tilling Problem
import java.util.*;
public class R11{
    public static int tillingProblem(int n){ //2 X n (fool size)
        //bc
        if(n==0||n==1){
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1=tillingProblem(n-1);
        //horizontal choice
        int fnm2=tillingProblem(n-2);

        int totalWays=fnm1+fnm2;
        return totalWays;
    }
    public static void main (String arg[]){
        System.out.println(tillingProblem(7));
    }
}