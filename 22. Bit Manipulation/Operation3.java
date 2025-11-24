import java.util.*;
public class Operation3{
    public static int getI(int n,int i){
        //n is number, i is postion start from 0
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
        return n=(n | bitMask);
    }
    public static int clearI(int n,int i){
        //n is number, i is postion 
        int bitMask=(~(1<<i));//~ is not of(1<<i) means 1<<i=00i00 ~ will give 11i11 like this
        return n=(n & bitMask);
    }
    public static int updateI(int n,int i, int newBit){

        // Approach 1
        // if(newBit==0){
        //     return clearI(n,i);
        // }else{
        //     return setI(n,i);
        // }

        // Approach 2
        n=clearI(n,i);
        int bitMask=newBit<<i;
        return n=(n|bitMask);
    }
    public static int clearLastI(int n,int i){
        int BitMask=(-1)<<i;
        // OR BitMask=(~0)<<i;
        return n=(n & BitMask);
    }
    public static void main(String args[]){
        System.out.println(getI(10,3));// 10 in binary 1010 so 3 position(3,2,1,0)
        System.out.println(setI(10,2));//1010 | 000000100 (position 2) give 00001110 
                            // or 1110 as 0|1=1 and 1110=14
        System.out.println(clearI(10,1));
        //15 is number, 3 is postion 
        System.out.println(updateI(10,2,1));
        System.out.println(clearLastI(15,2));
    }
}