package OOPB1;

public interface interFaceb1 {
    public void drawShape();
}
class Circle implements interFaceb1{
    public void drawShape(){
        System.out.println("circle is round");
    }

}
class Triangle implements interFaceb1{
    public void drawShape(){
        System.out.println("Triangle is three angel");
    }

}
class Main{
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.drawShape();
    }
}