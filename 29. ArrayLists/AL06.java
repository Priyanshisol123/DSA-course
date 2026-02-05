//creating and printing multi-dimensional arraylist
import java.util.ArrayList;
public class AL06{
    public static void main(String args[]){
        System.out.println();
        ArrayList<ArrayList<Integer>> MainList=new ArrayList<>();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            list1.add(i*1);//table of 1(1,2,3,4,5)
            list2.add(i*2);//table of 2(2,4,6,8,10)
            list3.add(i*3);//table of 3(3,6,9,12,15)
            //setting the values for all 3 lists
        }
        
        MainList.add(list1);
        MainList.add(list2);
        MainList.add(list3);
        list2.remove(3);
        list2.remove(2);
        
        System.out.println("List will now be printed without using loop");
        System.out.println(MainList);
        System.out.println();
        System.out.println("List will now be printed using loop");
        // Mainlist ke loop mein sari lists ayegi now jo bhi list hogi
        // cuurect i par main list ke loop mein woh currList mein store 
        // ho jayegi next loop mein jo currecnt list hai woh loop 
        // lagayegi and ese currlist ki size bhi mil jayega loop mein 
        //  lagane ke liye
        for(int i=0;i<MainList.size();i++){
            ArrayList<Integer> currList=MainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}