public class variableNtechOverride {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Toyota";
        vehicle.model = "Alien";
        System.out.println(vehicle.brand + " Has Many modal one is, " + vehicle.model);

        MotorCycle  motorCycle = new MotorCycle ();

        purchase(vehicle.brand, vehicle.model,vehicle.wheel);
        purchase(vehicle.brand, vehicle.model,motorCycle.wheel);

    }

    public static void purchase(String brand, String modal, int wheel) {
        String name = "Shamim";
        System.out.println(name + " Wants to buy a " + brand + " " + modal + " car " + " Has " + wheel + " wheel ");

    }
}

class Vehicle {
    String brand;
    String model;
    static int wheel = 4;
}

class MotorCycle  extends Vehicle {
    int wheel = 2;
}
