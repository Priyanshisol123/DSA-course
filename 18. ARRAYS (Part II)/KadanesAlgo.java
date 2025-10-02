import java.util.*;
//max sum of sub array and max and min sum
//max sum of subarray of array with all negative numbers
//using Kadane's Algo
public class KadanesAlgo{
    public static void kadanessubarraymaxsum(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currsum=0;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            currsum=currsum+numbers[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
            cs=cs+numbers[i];
            min=Math.min(cs,min);
        }
        System.out.println("Max subarray sum is="+maxsum+", Min="+min);
    } 
    public static void kadanesNegativeArr(int numbers[]){
        int maxsum=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currsum=0;
        int cs=0;
        for(int i=0;i<numbers.length;i++){
            currsum=numbers[i];
            maxsum=Math.max(currsum,maxsum);
            cs=cs+numbers[i];
            min=Math.min(cs,min);
        }
        System.out.println("Max subarray sum is="+maxsum+", Min="+min);
    } 
    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanessubarraymaxsum(numbers);
        int numbers2[]={-4,-3,-1,-5,-5,-2};
        kadanesNegativeArr(numbers2);
    }
}