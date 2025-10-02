import java.util.*;
//HW max sum of sub array and max and min sum
//Brute force
public class SubarraySum{
    public static void sumofSubarray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int s;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                s=0;
                for(int k=i;k<=j;k++){
                    s=s+numbers[k];
                }
                if(s<min){
                    min=s;
                }
                if(s>max){
                    max=s;
                }
                System.out.print(s+" ");
            }
            System.out.println();
        }
        System.out.println("Max="+max+", Min="+min);
    } 

    public static void main(String args[]){
        int numbers[]={1,-2,6,-1,3};
        sumofSubarray(numbers);
    }
}