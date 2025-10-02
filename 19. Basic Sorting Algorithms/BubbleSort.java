import java.util.*;
public class BubbleSort{
    public static void bubbleSort(int arr[]){
        int swaps=0;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swaps++;
                }
            }
            if(swaps==0){
                System.out.println("array already sorted");
                return;
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printArr(arr);
        int arr1[]={1,2,3,4,5};//sorted
        bubbleSort(arr1);
        printArr(arr1);
    }
}