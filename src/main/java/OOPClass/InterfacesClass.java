package OOPClass;

public interface InterfacesClass {
    void drawShape();
}

class Rectangale implements InterfacesClass{
    public void drawShape(){
        System.out.println("Draw a rectangle");
    }
}
class Circle implements InterfacesClass{
    public void drawShape(){
        System.out.println("Draw a Circle");
    }
}

class Main{
    public static void main(String[] args) {
        InterfacesClass rectangle=new Rectangale();
        rectangle.drawShape();

        InterfacesClass circle=new Circle();
        circle.drawShape();
    }
}
