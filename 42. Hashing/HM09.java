//Hash set Iterator
import java.util.*;
public class HM09{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");

        // Iterator it=set.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for(String letter:set){
            System.out.println(letter);
        }
    }
}