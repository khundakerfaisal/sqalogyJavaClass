package OOPB1;

public class methodOverB1 {
    public static void main(String[] args) {
        CYCLE cycle = new CYCLE();
        cycle.WHEEL();


    }
}

class Vehicle {
    public void Sound() {
        System.out.println("vehicle has a sound");
    }

    public void WHEEL() {
        System.out.println("vehicle has WHEEL");
    }

}

class CYCLE extends Vehicle {
    @Override
    public void WHEEL() {
        System.out.println("cycle has 2 WHEEL");
    }
}
