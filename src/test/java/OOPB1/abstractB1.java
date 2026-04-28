package OOPB1;

public class abstractB1 {
    public static void main(String[] args) {
        Fruits apple=new Apple();
        apple.Taste();
    }
}

abstract class Fruits{
    abstract public void Taste();

}

class Apple extends Fruits{
    public void Taste(){
        System.out.println("Apple test is sweet");
    }
}
class Orange extends Fruits{
    public void Taste(){
        System.out.println("Orange test is sour");
    }
}
class Graph extends Fruits{
    public void Taste(){
        System.out.println("Graph test is sweet");
    }
}