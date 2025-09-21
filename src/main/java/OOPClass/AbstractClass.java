package OOPClass;

public class AbstractClass {

    public static void main(String[] args) {
        Food tehari=new Tehari();
        tehari.cookFood();
    }
}

abstract class Food{
    abstract void cookFood();
}

class Tehari extends Food{
    void cookFood(){
        System.out.println("Tehari is cooking");
    }
}
class mutton extends Food{
    void cookFood(){
        System.out.println("Mutton is cooking");
    }
}
