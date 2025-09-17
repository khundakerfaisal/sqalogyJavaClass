public class variableNtechClass {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "Toyota";
        car1.modal = "Premio";

        car2.brand = "Pazero";
        car2.modal = "axios";

        System.out.println("Brand: " + car1.brand);
        System.out.println("Modal: " + car1.modal);
        System.out.println("Brand: " + car2.brand);
        System.out.println("Modal: " + car2.modal);

        System.out.println(car1.modal + " has " + car1.wheel + " wheel ");
        System.out.println(car2.modal + " has " + car2.wheel + " wheel ");

        purchase(car1.brand, car2.modal);

    }

    public static void purchase(String brand, String modal) {
        String name = "mahin";
        System.out.println(name + " wants to buy a " + brand + " " + modal + " car ");
    }

}

class Car {
    String brand;
    String modal;
    static int wheel = 4;
}
