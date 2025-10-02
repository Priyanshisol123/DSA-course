//subarrays like substrings
import java.util.*;
public class StringSubstring{
    public static String substring(String str,int start_index,int end_index){
        String substr="";
        for(int i=start_index;i<end_index;i++){
            substr += str.charAt(i);//concatination
        }
        return substr;
    }
    public static void main(String args[]){
        String str="HelloWorld";
        System.out.println(str.substring(3,6));//inbuit
        System.out.println(substring(str,5,str.length()));
    }
}