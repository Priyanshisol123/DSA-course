import java.util.*;
public class Hybrid13inheritance{
    public static void main(String args[]){
        Mammal13 a=new Mammal13();
        a.eat();
        a.walk();
        //dobby.fly(); wont work
        //but all 3 child classes can use prop of base class
        //that is eats and breats but cant use the other child
        //classes prop
        Bird13 b=new Bird13();
        b.eat();
        b.fly();
        Fish13 c=new Fish13();
        c.eat();
        c.swim();
    }
}
//Base class
class Animal13{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammal13 extends Animal13{
    void walk(){
        System.out.println("walks");
    }
}

class Bird13 extends Animal13{
    void fly(){
        System.out.println("fly");
    }
}

class Fish extends Animal13{
    void swim(){
        System.out.println("swims");
    }
}