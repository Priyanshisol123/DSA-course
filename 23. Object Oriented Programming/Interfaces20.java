import java.util.*;
public class Interfaces20{
    public static void main(String args[]){
        Queen q= new Queen();
        q.moves();   

        Bear b=new Bear();
        b.eat();
        b.breath();
        b.walk();
    }
}

interface ChessPlayer{
    //blue print
    //yahan moves to define kara hai sirf and every class
    // has its own implementation of moves
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all 8 directions)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right(in all 4 directions)");
    }
}
class king implements ChessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(bu 1 step)");
    }
}
//for multiple class implementation
interface Herbivorous{
    void eat();
    void breath();
}
interface Carnivorous{
    void eat();
    void walk();
}
class Bear implements Herbivorous,Carnivorous{
    public void eat(){
        System.out.println("Eats both plants and animals");
    }
    public void breath(){
        System.out.println("breadths");
    }
    public void walk(){
        System.out.println("walks");
    }
}