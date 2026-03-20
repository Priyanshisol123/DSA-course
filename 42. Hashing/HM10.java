//LinkedHashSet and TreeSet
import java.util.*;
public class HM10{
    public static void main(String args[]){
        HashSet<String> set=new HashSet<>();
        set.add("X");
        set.add("B");
        set.add("C");
        set.add("N");
        System.out.println(set);

        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        lhs.add("X");
        lhs.add("B");
        lhs.add("C");
        lhs.add("N");
        System.out.println(lhs);

        TreeSet<String> ts=new TreeSet<>();
        ts.add("X");
        ts.add("B");
        ts.add("C");
        ts.add("N");
        System.out.println(ts);
    }
}