import java.util.*;
public class Q3LargestString{
    public static void main(String args[]){
        String fruits[]={"apple","Mango","banana"};
    //smaller is bigger according to lexicographic method  
    // a>b,a>A,b>c...
        String largest1=fruits[0];
        String largest2=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest1.compareTo(fruits[i])<0){
                largest1=fruits[i];//m>M,M>b,b>M
            }
            if(largest2.compareToIgnoreCase(fruits[i])<0){
                largest2=fruits[i];//m=M,b>m
            }
        }
        System.out.println(largest1);
        System.out.println(largest2);
    }
}