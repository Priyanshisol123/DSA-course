//Friends Rairing Problem
import java.util.*;
public class R13{
    public static int friendsPairing(int n){ 
        //bc
        if(n==1||n==2){
            return n;
        }
        // //choices
        // //single
        // int fnm1=friendsPairing(n-1);

        // //pair
        // int fnm2=friendsPairing(n-2);
        // int pairWays=(n-1)*fnm2;

        // //total ways
        // int totalWays=fnm1+pairWays;
        // return totalWays;

        return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
    }
    public static void main (String arg[]){
        System.out.println(friendsPairing(3));
    }
}