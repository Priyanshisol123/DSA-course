public class Copy6Constructor{
    public static void main(String args[]){
        Student6 s1=new Student6();
        s1.name="Priyanshi";
        s1.roll=456;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=90;
        s1.marks[2]=80;
        // Suppose object1 s1 frogets their password so we have to create 
        // a new object for them s2 and s1 ki sari prop. s2
        // ke andar copy ho jaye

        // copy constructor
        Student6 s2=new Student6(s1);//copy
        s2.password="xyz";

        s1.marks[2]=100;
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        // copy karne ke baad bhi ham s1 mein change karte hain but
        // baad mein s1 change karne par bhi woh change s2 mein ayega 
        // this is beacause ham array ko copy kara hai wahan marks
        // array copy nahi hua sirf uska refrence copy hokar aya hai 
        // and refernce always points to the original text which we
        //  chnage . that is marks 
   }
}
class Student6{
    String name;
    int roll;
    String password;
    int marks[];

    // copy constuctor
    Student6(Student6 s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;//refrence copy hoke aya hai sari 
        // value copy nahi hui hai. This creates issue and to solve it we use shallow and deep copy
    }
    Student6(){
        marks=new int[3];
        System.out.println("\nA Constuctor is created\n");
    }
}