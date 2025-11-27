// CLASS AND OBJECT
public class OOPs1{
// Java class name start with capital letter
// And function is with small letter
    public static void main(String args[]){
//public-keyword access specifier,static keyword 
// signifies that the main method belongs to the 
// class itself, rather than to any specific instance 
// (object) of that class. void return type, 
        // This is main function this is first search 
        // searched by compiler and it is the 
        // starting of the execuiton of the program
        Pen1 p1=new Pen1();//Create a pen object p1
        // Pen() is a special type of function called constructor
        
        // p1.setColor(newColor);
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // Can be reset multiple times
        p1.setColor("Yellow");
        System.out.println(p1.color);
        // Can be set without fuction call also
        p1.color="red";
        System.out.println(p1.color);
    }
}
// it is better to write other classes after public class
// cuz if these classes are made above public then it will 
// be problem to create objects
class Pen1{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}
class Student1{
    String name;
    int age;
    float percentage;//cgpa

    void calculatePercentage(int phy,int chm, int math){
        percentage=(phy+chm+math)/3;
    }
}
// class Animal1{

// }