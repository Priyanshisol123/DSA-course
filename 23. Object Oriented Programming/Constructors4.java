public class Constructors4{
    public static void main(String  args[]){
        Student4 s1=new Student4();
        Student4 s2=new Student4("Priyanshi");
        System.out.println(s2.name);
    }
}
class Student4{
    String name;
    int roll;
    // This is a COnstructor
    // if not define it create default constructor
    Student4(){
        System.out.println("Constructor is called...");
    }
    Student4(String name){
        this.name=name;
    }
}