import java.util.*;
public class String_Builder{
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("");
        //Initialized with empty string ,can also be null
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);//add at the end
        }//abcdefghijklmnopqrstuvwxyz
        //O(26) for string builder
        //O(n^2) for string when += done
        //program of string can be done by string builder
        //program of string builder may/may not be done by string 
        System.out.println(sb);
        System.out.println(sb.length());
    }
}