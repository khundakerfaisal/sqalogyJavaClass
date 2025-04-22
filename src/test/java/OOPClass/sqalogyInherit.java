package OOPClass;

public class sqalogyInherit {


    public static void main(String[] args) {
        Bird bird=new Bird();
        bird.eat();
        bird.fly();

    }
}
class Bird{
    public void eat(){
        System.out.println("bird can eat");
    }
    public void fly(){
        System.out.println("bird can fly");
    }

}
class animal extends Bird{

}

