import java.util.*;
//import java.util.Arrays; this is a part of util so * also works
//import java.util.Collections; this is a part of util so * also works
//for using collection we put Integer where it was inyt
public class InbuiltSort{
    public static void printArr(Integer arr[]){
        for(Integer i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        Integer arr[]={5,4,3,2,1};
/* this is not object sort so int works for this
        System.out.println("Original Array");
        printArr(arr);

        System.out.println("Method 1");
        Arrays.sort(arr,0,3);//argument
        printArr(arr);

        System.out.println("Method 2");
        Arrays.sort(arr);//argument
        printArr(arr);
*/        
        Integer arr1[]={4,5,1,3,2};//now an object

        System.out.println("Original Array");
        printArr(arr1);

        System.out.println("Method 3");
        Arrays.sort(arr1,0,3,Collections.reverseOrder());
        //argument for descending order
        printArr(arr1);

        System.out.println("Method 4");
        Arrays.sort(arr1, Collections.reverseOrder());
        //argument for descending order
        printArr(arr1);
    }
}