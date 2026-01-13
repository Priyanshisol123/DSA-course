import java.util.*;
public class Hierarchical12inheritance{
    public static void main(String args[]){
        Mammal12 a=new Mammal12();
        a.eat();
        a.walk();
        //dobby.fly(); wont work
        //but all 3 child classes can use prop of base class
        //that is eats and breats but cant use the other child
        //classes prop
        Bird12 b=new Bird12();
        b.eat();
        b.fly();
        Fish c=new Fish();
        c.eat();
        c.swim();
    }
}
//Base class
class Animal12{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal12 extends Animal12{
    void walk(){
        System.out.println("walks");
    }
}

class Bird12 extends Animal12{
    void fly(){
        System.out.println("fly");
    }
}

class Fish extends Animal12{
    void swim(){
        System.out.println("swims");
    }
}