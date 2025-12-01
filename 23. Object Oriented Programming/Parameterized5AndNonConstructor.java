public class Parameterized5AndNonConstructor{
    public static void main (String args[]){
        Student5 s1=new Student5();//call connstructor
        Student5 s2=new Student5("Priyanshi");//^
        Student5 s3=new Student5(123);//^
        // Student5 s3=new Student5("name",123);
        // This constructor wont be called as not ocnstructor like this exists
    }
}
class Student5{
    String name;
    int roll;
    // non parameterized COnstructor
    Student5(){
        System.out.println("Constructor is called...");
    }
    // parameterized COnstructor
    Student5(String name){
        this.name=name;
    }
    // parameterized COnstructor
    Student5(int roll){
        this.roll=roll;
    }
}