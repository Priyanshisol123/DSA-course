public class Shallow7AndDeepCopy{
    public static void main(String args[]){
        Student7 s1=new Student7();
        s1.name="Priyanshi";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;

        // copy constructor
        Student7 s2=new Student7(s1);//copy
        s2.password="xyz";

        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
    }
}
class Student7{
    String name;
    int roll;
    String password;
    int marks[];
    
    //Shallow copy constructor
    // Student(Student s1){
    //     marks=new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //deep copy constructor 
    Student7(Student7 s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
        //here a new array is created and this is not a
        // refrence of the original array but a newly 
        // created and copied data array
    }
    Student7(){
        marks=new int[3];
        System.out.println("Constructor is created");
    }
} 