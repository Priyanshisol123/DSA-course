import java.util.*;
public class Assignment2{
    public static int search(int num[],int target){
        int min=minSearch(num);
        if(num[min]<=target && target<=num[num.length-1]){
            return search(num,min,num.length-1,target);
        }else{
            return search(num,0,min,target);
        }
    } 
    public static int search(int num[],int left,int right,int target){
        int l=left;
        int r=right;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(num[mid]==target){
                return mid;
            }else if(num[mid]>target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return -1;
    }
    public static int minSearch(int num[]){
        int left=0;
        int right=num.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(mid>0 && num[mid-1]>num[mid]){
                return mid;
            }
            else if(num[left]<=num[mid] && num[mid]>num[right]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
    public static void main(String args[]){
        int num[]={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(num,target));
    }
}