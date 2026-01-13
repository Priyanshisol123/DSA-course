import java.util.*;
//Abstraction concept ye hai ki the function doesnt depend on animal class
//but it only gets idea from abstract class and then the function is added seperately 
// the object of abstract class cannot be created 
public class Abstract19class{
    public static void main(String args[]){
        // Horse h= new Horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // h.changeColor();
        // System.out.println(h.color);

        // Chicken c= new Chicken();
        // c.eat();
        // c.walk();
        // System.out.println(c.color);
        // c.changeColor();
        // System.out.println(c.color);

        Mustang myHorse=new Mustang();
        //this is the code for showing heirarchy and how 
        // constructors are called if all classes have it 
        // but we only call the child class still all 
        // constructors will execute from base to child class
    }
}
//abstract class
abstract class Animal19{
    String color;
    //constructor
    Animal19(){
        System.out.println("Animal constructor call");
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }
    //abstract function
    abstract void walk();
    //har animal ka walk function hoga par kesa hoga woh
    // class khud batayega
}
//animal 
class Horse extends Animal19{
    Horse(){
        System.out.println("Horse constructor call");
    }
    //matlab haorse default brown color hoga unless we 
    // changeColor apply this function
    void changeColor(){
        color="dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
        //own definition of animals for walk
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor call");
    }
}
//animal 
class Chicken extends Animal19{
    Chicken(){
        System.out.println("Chicken constructor call");
    }
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
        // walk will be for all animal as the all are 
        // extends to animal class
    }
}
