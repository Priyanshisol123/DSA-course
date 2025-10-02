//String function - compare
import java.util.*;
public class StringCompare{
    public static void main (String args[]){
        String s1="Tony";
        String s2="Tony";
        String s3=new String("Tony");

        if(s1==s2){//equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
            //compare strings on object level
        if(s2==s3){//not equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
            //compare values
        if(s3.equals(s1)){// compare function //equal
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}