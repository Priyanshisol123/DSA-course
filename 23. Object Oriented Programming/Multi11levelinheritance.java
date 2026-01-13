import java.util.*;
public class Multi11levelinheritance{
    public static void main(String args[]){
        Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}
//Base class
class Animal11{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal11{
    int legs;
}

class Dog extends Mammal{
    String breed;
}