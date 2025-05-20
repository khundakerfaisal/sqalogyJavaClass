package OOPClass;

public class sqaInheritanceClass {
    public static void main(String[] args) {
        vehicle vehicle=new vehicle();
        vehicle.wheel();
        vehicle.sound();

    }
}
class transport{
    public void wheel(){
        System.out.println("car has 4 wheel");
    }
    public void sound(){
        System.out.println("bus has one horn");
    }
}
class vehicle extends transport{
}
