import java.util.*;
public class Operation{
    public static int getI(int n,int i){
        //n is number, i is postion 
        int bitMask=(1<<i);
        if((n & bitMask) ==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static int printBinaryno(int n){
        for(int i=3;i>=0;i--){
            System.out.print(getI(n,i));
        }
        return 0;
    }
    public static int setI(int n,int i){
        //n is number, i is postion 
        int bitMask=(1<<i);
        n=(n | bitMask);
    }
    public static int clearI(int n,int i){
        //n is number, i is postion 
        int bitMask=(1<<i);
        if((n & bitMask) ==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String args[]){
        System.out.println(getI(9,0));
        printBinaryno(9);
        //15 is number, 3 is postion 
    }
}