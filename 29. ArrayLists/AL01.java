import java.util.ArrayList;
//introduction
public class AL01{
    public static void main(String args[]){
        //java collection framework
        //CLassName objectName = new ClassName();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();    

        //Add an element in Al
        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);//dynamic
        list.add(5);

        //to add at a particular index and the 
        // already added will shift back
        list.add(1,9);

        System.out.println(list);

        //Get Operation O(1)
        //get is only used to access array list
        int element=list.get(2);//2 is index
        System.out.println(element);

        //delete or remove opeation
        list.remove(2);//2 is index
        System.out.println(list);//O(n)

        //Set Element at index O(n)
        list.set(2,10);//index,value
        System.out.println(list);

        //Contains Element O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(0));//true or false
        
        //Size of arraylist
        System.out.println(list.size());

        //print arraylist using size 
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}