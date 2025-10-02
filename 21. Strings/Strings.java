import java.util.*;
public class Strings{
    public static void printAllLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){

        //String concatenation
        String firstName="Priyanshi";
        String lastName="Solanki";
        String fullName=firstName+" "+lastName;
        System.out.println(fullName);

        //String charAt Method: to find the character 
        // at the location given  
        System.out.println(fullName.charAt(1));//0P 1r 2i...
        //printing all leters of string 
        printAllLetters(fullName);//function defined above

        //function-String Length
        String aName="Tony Stark"; //10 space also count
        System.out.println(aName.length());
        System.out.println(fullName.length());
        //Array ke andar length ek property hoti hai 
        // isiliye wahan parenthesis nahi lagate
        // aur String ke andar kyunki length ek fuction 
        // hota hai toh yahan parenthesis lagate hai

        // Input-Output
        Scanner sc=new Scanner(System.in);
        String name,p;

        p=sc.nextLine(); //for line
        System.out.println(p);

        System.out.println("next:");
        name=sc.next(); //for word   
        System.out.println(name);

        char arr[]={'a','b','c','d'};
        String str1="abcd";
        String str2=new String("xyz");

        //Strings are immutable        
    }
}