package OOPClass;

public class oopInheritClass {
    public static void main(String[] args) {
        car cycle=new cycle();
        cycle.wheel();
        cycle.horn();

    }

}
class car{
    public void wheel(){
        System.out.println("car has 4 wheel");
    }
    public void horn(){
        System.out.println("car has horn");
    }

}
class cycle extends car{
    public void wheel(){
        System.out.println("cycle has 2 wheel"); //overriding
    }


}