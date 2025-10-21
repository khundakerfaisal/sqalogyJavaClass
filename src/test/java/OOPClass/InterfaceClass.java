package OOPClass;

public interface InterfaceClass {
    void turnOn();
    void turnOff();

}

class TV {
    public void turnOn() {
        System.out.println("TV is ON");
    }

    public void turnOff() {
        System.out.println("TV is OFF");
    }
}
class FAN {
    public void turnOn() {
        System.out.println("FAN is ON");
    }

    public void turnOff() {
        System.out.println("FAN is OFF");
    }
}
class Main{
    public static void main(String[] args) {
//        InterfaceClass tv = new TV();
////        InterfaceClass fan = new FAN();
//
//        tv.turnOn();    // TV is ON
//        fan.turnOn();   // Fan is ON
    }
}



