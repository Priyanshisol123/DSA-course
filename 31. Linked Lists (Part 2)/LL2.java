import java.util.LinkedList;//JCF -> optimized code
import java.util.*;
public class LL2{

    public static void main(String[] args) {

        //java collections framework 
        //create-int, float, boolean -> Integer, Float, Character
        LinkedList<Integer> ll=new LinkedList<>();
        // add
        ll.addLast(1);//1
        ll.addLast(2);//1,2
        ll.addFirst(0);//0,1,2
        //0->1->2
        System.out.println(ll);//[0,1,2]
        //remove
        ll.removeFirst();//1,2
        ll.removeLast();//1
        System.out.println(ll);//[1]
    }
}