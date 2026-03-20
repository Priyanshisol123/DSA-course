//HashMap operations
import java.util.*;
public class HM01{
    public static void main(String args[]){
        //create-O(1)
        HashMap<String,Integer> hm=new HashMap<>();//unordered
        //Insert-O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        
        System.out.println(hm);

        //Get-O(1)
        int population=hm.get("India");
        System.out.println(population);

        System.out.println(hm.get("Indonesia"));

        //Contains key-O(1)
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Indonesia"));//null

        //remove operation-O(1)
        System.out.println(hm.remove("China"));//removes an return the value or returns null
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear the hm
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}