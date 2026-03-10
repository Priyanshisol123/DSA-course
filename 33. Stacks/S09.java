//Duplicate Parentheses
//Given a balanced expression, find if it contains 
// duplicate parentheses or not. A set of parentheses
//are duplicate if the same subexpression is 
// surrounded by multiple parentheses 
//          return a true if it contains duplicates 
// else return false
//example: (((a+(b)))+(c+d)), ((((a)+(b))+c+d)), 
//     (((a+b))+c)
//  ((a+b)+(c+d)) false
import java.util.*;
public class S09{
    public static boolean isDuplicate(String str){//O(n)
        Stack<Character> s=new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);

            //closing
            if(ch==')'){
                int count=0;
                while(s.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true; //duplicate
                } 
            }else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        //valid string
        String str="((a+b))";//true
        String str2="(a-b)";//false
        System.out.println(isDuplicate(str2));
    }
}