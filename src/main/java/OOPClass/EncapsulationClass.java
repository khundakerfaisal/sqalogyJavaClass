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
        EncapsulationClass encapsulationClass=new EncapsulationClass();
        encapsulationClass.setWheel(4);
        System.out.println(encapsulationClass.getWheel());


    }
}
class Car{
    public void showDetails(){
       Bike bike=new Bike();
        System.out.println(bike.showDetails());

    }
}
class Bike{
    public void showDetails(){
        EncapsulationClass encapsulationClass=new EncapsulationClass();
        encapsulationClass.color="Red";
        encapsulationClass.setBrand("Pulsar");

    }
}

