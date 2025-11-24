import java.util.*;
public class Q3Count6setBits{
    public static int countset1bits(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){//check our LSB
                count++;
            }
            n=n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(countset1bits(16));
    }
}