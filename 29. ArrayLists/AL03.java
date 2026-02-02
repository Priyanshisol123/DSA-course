//Find Maximum value in Array List
import java.util.ArrayList;
public class AL03{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(8);        
        int max=Integer.MIN_VALUE;//O(n) tc linear time
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max=list.get(i);
            // }
            max=Math.max(max,list.get(i));
        }
        System.out.println("max element="+max);
    }
}