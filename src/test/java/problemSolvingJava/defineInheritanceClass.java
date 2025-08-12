package problemSolvingJava;
class Animal {
    public void Eat() {
        System.out.println("Animal can eat");
    }
    public void Sound() {
        System.out.println("Animal can sound");
    }
}

class Dog extends Animal {
    @Override
    public void Sound() {
        System.out.println("Dog has barking");
    }
}

public class defineInheritanceClass {
        public static void main(String[] args) {
            Animal dog = new Dog(); // Create Dog object
            dog.Sound(); // Calls Dog's version
        }



}
