//Sorting in ArrayList
import java.util.ArrayList;
import java.util.Collections;
// import java.util.*;
public class AL05{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        System.out.println(list);
        //acsending order
        Collections.sort(list);
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        //Comparator-nfunctions in java that define the logic of how the sorting should be done
        System.out.println(list);
    }
} 