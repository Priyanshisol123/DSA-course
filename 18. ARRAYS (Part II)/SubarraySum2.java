import java.util.*;
//max sum of sub array and max and min sum
//using prefix array sum 

public class SubarraySum2{
    public static void prefixsumofSubarray(int numbers[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int s;
        int prefix[]=new int[numbers.length];

        prefix[0]=numbers[0];
        //calculate prefix array
        for (int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                
                s= start==0? prefix[end] : prefix[end]-prefix[start-1];
                
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
        prefixsumofSubarray(numbers);
    }
}