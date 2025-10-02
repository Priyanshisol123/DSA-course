import java.util.*;

public class ArrayCC{
    
        //passing array as an argument
        public static void update(int m[],int nonchangable){
            nonchangable=10;//pass by value
            for(int i=0;i<m.length;i++){
                m[i]=m[i]+1;
                m[0]=0;
                //call by refrence as cheanges are made to the original array
            }
        }//function

    public static void main(String args[]){

        int m[]={97,98,99};
        int nonchangable=5;
        update(m,nonchangable);//function call by refrence
        System.out.println(nonchangable);//pass by value as no change in original value
        for(int i=0;i<m.length;i++){
            System.out.println(m[i]+" ");
        }

        //Array creatiom
        int mark[]=new int[50];//by default all 50 values are null or 0
        int numbers[]={2,3,4};
        String fruits[]={"apple","mango","orange"};

        //input of array
        int marks[]=new int[100];//declare
        System.out.println("length of an array: "+marks.length); //array length

        System.out.println("Enter marks for 3 subjects:");

        Scanner sc=new Scanner(System.in);//input
        // int phy;
        // phy=sc.nextInt();
        marks[0]=sc.nextInt();//marks of 1 subject
        marks[1]=sc.nextInt();//marks of 2 subject
        marks[2]=sc.nextInt();//marks of 3 subject

        System.out.println("Subject 1:"+marks[0]);
        System.out.println("Subject 2:"+marks[1]);
        System.out.println("Subject 3:"+marks[2]);

        //update
        marks[2]=100;
        System.out.println("updated\nSubject 3:"+marks[2]);

        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage = "+percentage+"%");

        
    }
}