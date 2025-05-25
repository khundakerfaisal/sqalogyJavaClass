package OOPClass;

public class FoodAbstractClass {
    public static void main(String[] args) {
        Fruit Apple=new Apple();
        Apple.taste();

        Fruit Lemon=new Lemon();
        Lemon.taste();


    }
}
abstract class Fruit {
    abstract String taste(); // Abstract method
}

class Apple extends Fruit {
    String taste() {
        return "Sweet";
    }
}

class Lemon extends Fruit {
    String taste() {
        return "Sour";
    }
}
