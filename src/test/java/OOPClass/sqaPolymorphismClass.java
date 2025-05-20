package OOPClass;

public class sqaPolymorphismClass {
    public static void main(String[] args) {
        Animal a;

        Animal dog = new Dog();
        dog.sound();  // Dog barks

        Animal cat = new Cat();
        cat.sound();  // Cat meows
    }
}
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}