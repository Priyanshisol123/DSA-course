//Find if any pair in sorted Arraylist has a target sum
import java.util.ArrayList;
public class AL08{
    //using 2 pointer approach
    public static boolean pairSum1(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }//case2
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }//case3
            else{
                rp--;
            }
        }
        return false;
    }
    //Brute force approach
    public static boolean pairSum1b(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1; j<list.size(); j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);    
        list.add(4);
        list.add(5);
        list.add(6); 
        int target=5;          
        System.out.println(pairSum1b(list,target));
        System.out.println(pairSum1(list,target));
        //it shows if the pair exists or not but 
        // it does not show the pair
    }
}