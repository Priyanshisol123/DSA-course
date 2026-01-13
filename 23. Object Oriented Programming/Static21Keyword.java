import java.util.*;
public class Static21Keyword{
    public static void main(String args[]){
        Student s1=new Student();
        s1.schoolName="JVM";

        Student s2= new Student();
        System.out.println(s2.schoolName);

        Student s3=new Student();
        s3.schoolName="ABC";
        System.out.println(s3.schoolName);
        System.out.println(s2.schoolName);
    }
}
class Student{
    //static function
    static int returnPercentage(int Math, int phy,int chem){
        return (Math + phy + chem)/3;
    }

    String name;
    int roll;

//static variable
    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}