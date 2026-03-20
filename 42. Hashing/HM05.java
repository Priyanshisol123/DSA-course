//Linked HashMap Implementation,TreeMap
import java.util.*;
public class HM05{
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();//fixed order as insertion
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Nepal",5);
        lhm.put("Europe",45);
        lhm.put("US",50);
        lhm.put("Indonesia",6);

        System.out.println(lhm);

        HashMap<String,Integer> hm=new HashMap<>();//unordered
        hm.put("India",100);
        hm.put("China",150);
        hm.put("Nepal",5);
        hm.put("Europe",45);
        hm.put("US",50);
        hm.put("Indonesia",6);

        System.out.println(hm);

        TreeMap<String,Integer> tm=new TreeMap<>();//keys sorted
        tm.put("China",150);
        tm.put("Nepal",5);
        tm.put("Europe",45);
        tm.put("US",50);
        tm.put("Indonesia",6);

        System.out.println(tm);
    }
}