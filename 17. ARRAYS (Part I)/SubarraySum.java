import java.util.*;
//HW sum of sub array and max and min sum

public class SubarraySum{
    public static void sumofSubarray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int sum[]=new int[50];
        int s;
        for(int i=0;i<numbers.length;i++){
            for(int j=i;j<numbers.length;j++){
                s=0;
                for(int k=i;k<=j;k++){
                    s=s+numbers[k];
                }
                sum[j]=s;
                if(sum[j]<min){
                    min=sum[j];
                }
                if(sum[j]>max){
                    max=sum[j];
                }
                System.out.print(sum[j]+" ");
            }
            System.out.println();
        }
        System.out.println("Max="+max+", Min="+min);
    } 

    public static void main(String args[]){
        int numbers[]={2,4,6,8,10};
        sumofSubarray(numbers);
    }
}