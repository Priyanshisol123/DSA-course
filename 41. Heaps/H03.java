//heapsort
import java.util.*;
public class H03{
    public static void heapify(int arr[],int i,int size){
        int left=2*i+1;
        int right=2*i+2;
        int minIdx=i;//minIdx -> maxIdx for maxheap

        if(left<size && arr[minIdx]<arr[left]){//in max heap > -> <
            minIdx=left;
        }
        if(right<size && arr[minIdx]<arr[right]){//in max heap > -> <
            minIdx=right;
        }
        if(minIdx != i){
            //swap
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

            heapify(arr,minIdx,size);
        }
    }
    public static void heapSort(int arr[]){
        //step1-build maxheap
        int n=arr.length;
        for(int i=n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        //step2-push larget at end
        for(int i=n-1;i>0;i--){
            //swap (largest - first with last)
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            heapify(arr,0,i);
        }
    }
    public static void main (String args[]){
        int arr[]={1,2,4,5,3};
        heapSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}