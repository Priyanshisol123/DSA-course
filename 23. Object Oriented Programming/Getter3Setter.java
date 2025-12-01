public class Getter3Setter{
    public static void main (String agrs[]){
        Pen3 p1=new Pen3();
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        // cannot acces directly so we use getter
        // and setter to acces and modify private variable
    }
}
class Pen3{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color=newColor;
    }
    void setTip(int tip){//here tip is new
        this.tip=tip;//this.tip is old tip
    }
}