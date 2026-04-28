package OOPB1;

public interface interfaceb2 {
    public static void main(String[] args) {
        Duck duck=new Duck();
        duck.fly();
        duck.swim();
    }
}
interface fly{
    public void fly();
}

interface swim{
    public void swim();
}
class Duck implements fly,swim{
    public void fly(){
        System.out.println("duk can fly");
    }
    public void swim(){
        System.out.println("duk can swim");

    }
}
