package OOPB1;

public class overrideB2 {
    public static void main(String[] args) {
        Animalb1 cat=new CAT();

            cat.sound();

    }
}

class Animalb1{
    public void walk(){
        System.out.println("Animal is walk");
    }
    public void sound(){
        System.out.println("Animal can sound");
    }
}
class CAT extends Animalb1{
    @Override
    public void sound(){
        System.out.println("cat sound is MAWWW");
    }
}
