//Activity Selection
//You are given n activities with their start and end 
//times.Select the maximum number of activities that 
//can be performed by a single person, assuming that a 
//person can only work on a single activity at a time.
// activities are stored acc. to end time
//Start=[10,12,20] end=[20,25,30] ans=2(AO & A2)

import java.util.*;
public class G01{
    public static void main(String args[]){//O(n)
        int start[]={1, 3, 0, 5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9};

        //sorting 
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }

//sorting make O(nlogn)
        //lambda function -> short form of comparator(big function)
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));//O[2] ka matlab 2nd col ke basis par 3no col sort honge

        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        //1st activity
        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity Select
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd=activities[i][2];
            }
        }
        System.out.println("max activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}