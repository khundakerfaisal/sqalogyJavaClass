package OOPClass;

public class Vehicle {
    public String brand;
    private int wheel;
    private String colour;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void showDetails(){

    }
    public static void main(String[] args) {
        Vehicle bus=new bus();
        bus.showDetails();

        Vehicle bike=new bike();
        bike.showDetails();


    }

}
class bus extends Vehicle{
    public void showDetails(){
        Vehicle vehicle=new Vehicle();
        vehicle.setColour("Green");
        System.out.println(vehicle.getColour());

    }
}
class bike extends Vehicle{
    public void showDetails(){
        Vehicle vehicle=new Vehicle();
        vehicle.setColour("yellow");
        System.out.println(vehicle.getColour());

    }
}

