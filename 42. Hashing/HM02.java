//HashMap Iterate using set
import java.util.*;
public class HM02{
    public static void main(String args[]){
        HashMap<String,Integer> hm=new HashMap<>();//unordered
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);
        hm.put("Europe",45);
        
        //Iterate- can also use entry set hw 
        Set<String> keys=hm.keySet();//unordered
        System.out.println(keys);

        // foreach loop
        for(String k: keys){
            System.out.println("key = "+k+", value = "+hm.get(k));
        }
    }
}