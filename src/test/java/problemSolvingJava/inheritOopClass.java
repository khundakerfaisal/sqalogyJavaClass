package problemSolvingJava;


class Vehicle {
    public void wheel() {
        System.out.println("car has 4 wheel");
    }

    public void horn() {
        System.out.println("car has horn");
    }
}

class Cycle extends Vehicle {
    @Override
    public void wheel() {
        System.out.println("cycle has 2 wheel");
    }
}

public class inheritOopClass {
    public static void main(String[] args) {
        Vehicle cycle = new Cycle();
        cycle.wheel();
    }

}



