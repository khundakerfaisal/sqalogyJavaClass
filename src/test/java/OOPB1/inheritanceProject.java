package OOPB1;

public class inheritanceProject {
    public static void main(String[] args) {
        Animal cat=new Cat();
        cat.sound();
    }

}
class Animal{
    public void eat(){
        System.out.println("Animal can eat");
    }
    public void sound(){
        System.out.println("Animal can Maw");
    }
}

class Cat extends Animal{
    public void sound(){
        System.out.println("cat sound maw");
    }

}