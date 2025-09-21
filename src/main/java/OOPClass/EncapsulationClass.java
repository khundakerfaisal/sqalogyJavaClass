package OOPClass;

public class EncapsulationClass {




    private int wheel;

    public int getWheel(){
        return wheel;
    }

    public void setWheel(int wheel){
        this.wheel=wheel;
    }


    private  String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }
    public   String color;

    public static void main(String[] args) {

        Bike bike=new Bike();
        bike.showDetails();

        Car car=new Car();
        car.showDetails();



    }
}
class Car extends EncapsulationClass{
    public void showDetails(){
        EncapsulationClass encapsulationClass=new EncapsulationClass();
        encapsulationClass.color="Yellow";
        encapsulationClass.setBrand("Toyota");
        encapsulationClass.setWheel(4);
        System.out.println(encapsulationClass.getBrand());


    }
}
class Bike extends EncapsulationClass{
    public void showDetails(){
        EncapsulationClass encapsulationClass=new EncapsulationClass();
        encapsulationClass.color="Red";
        encapsulationClass.setBrand("Pulsar");
        encapsulationClass.setWheel(2);
        System.out.println(encapsulationClass.getBrand());

    }
}

