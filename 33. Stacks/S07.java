//Q5 Next Greater ELement
//The next greater element of some x in an array is the first greater 
//element that is to the right of x in the same array
//arr=[6,8,0,1,3]
//next Greater={8,-1,1,3,-1}
import java.util.*;
public class S07{
    public static void main(String args[]){//O(n)
        int arr[]={6,8,0,1,3};
        Stack<Integer> s=new Stack<>();
        int nxtGreater[]=new int[arr.length];
//this loop for next greatest left
        for(int i=arr.length-1;i>=0;i--){
            //1 while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){//here for smallest >= 
                s.pop();
            }

            //2 if-else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i]=arr[s.peek()];
            }
            
            //3 push in s stack
            s.push(i);
        }
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
        //next greater right
        // next greater left -loop 0 to n
        // next smallest right- reverse condition 15line
        // next smallest left- reverse condition 15line + 0 to n
    }
}