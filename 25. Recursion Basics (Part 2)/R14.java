//Friends Rairing Problem
import java.util.*;
public class R14{
    public static void printBinStrings(int n,int lastPlace, String str){ 
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        // if(lastPlace==0){
        //     //sit 0 on chair n
        //     printBinStrings(n-1,0,str.append("0"));
        //     printBinStrings(n-1,1,str.append("1"));
        // }else{
        //     printBinStrings(n-1,0,str.append("0"));
        // }
        // return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
        printBinStrings(n-1,0,str+"0");
        if(lastPlace==0){
            printBinStrings(n-1,1,str+"1");
        }
    }
    public static void main (String arg[]){
        printBinStrings(3,0,"");
    }
}