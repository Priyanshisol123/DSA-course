import java.util.*;

public class Method16Overriding{
    public static void main (String args[]){
        Deer16 d=new Deer16();
        //child class ke object mein child class 
        // ka fuction hi access hoga 
        d.eat();
    }
}
class Animal16{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer16 extends Animal16{
    void eat(){
        System.out.println("eats grass");
    }
}