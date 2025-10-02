import java.util.*;
//question to know wheter the given strings are palindrome
public class Q1Palindrome{
    public static boolean strPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String a="racecar",b="noon",c="madam",d="Krishn";
        int f=5/2;
        System.out.println(f);
        System.out.println(strPalindrome(a));
        System.out.println(strPalindrome(b));
        System.out.println(strPalindrome(c));
        System.out.println(strPalindrome(d));
    }
}