package OOPClass.Class2;

public class ploymorphismClass {
    //Method Overloading compile time polymorphism
//    public void sumOfAmount(int a,int b){
//        int totalAmount=a+b;
//        System.out.println("Sum of Amount is ::" +totalAmount);
//    }
//    public void sumOfAmount(int a,int b,int c){
//        int totalAmount=a+b+c;
//        System.out.println("Sum of Amount is ::" +totalAmount);
//    }
//    public static void main(String[] args) {
//        ploymorphismClass ploymorphismClass=new ploymorphismClass();
//        ploymorphismClass.sumOfAmount(5,4);
//    }

    //Method Overloading Run time polymorphism


    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.showDetails();
    }
}

class Vehicle {
    public String brand;
    public int Wheel;

    public void showDetails() {
    }
}

class Car extends Vehicle {
    public void showDetails() {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "TOYOTA";
        vehicle.Wheel = 4;
    }
}

class Bike extends Vehicle {
    public void showDetails() {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Pulsar";
        vehicle.Wheel = 2;
        System.out.println("Bike Has " + vehicle.brand + "And There is " + vehicle.Wheel + " Wheel");
    }
}
