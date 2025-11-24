import java.util.*;
public class Q2Power5oftwoornot{
    public static boolean ispowerof2(int n){
        // the 1st method(when int is the function)

        // int bitmask= n-1;
        // if((n&bitmask)==0){
        //     System.out.println("Number is a Power of 2 ");
        // }else{
        //     System.out.println("Number is not a Power of 2 ");
        // }
        // return 0; 
        // 
        // OR
        
        // the 2nd Method (when boolean is the function)
        return (n&(n-1))==0;//True is done and false if not done
    }
    public static void main(String args[]){
        System.out.println(ispowerof2(11));
    }
}