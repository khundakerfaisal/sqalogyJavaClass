package OOPClass;

public class practiseClassOOP1 {
        public practiseClassOOP1(){
        System.out.println("Total Price Is showing successfully");
    }
    public int practiseClassOOP1(int qty, int price){
        int totalPrice=qty*price;
        return totalPrice;

    }
    public static void main(String[] args) {
        practiseClassOOP1 pop1=new practiseClassOOP1();
        int grandTotal=pop1.practiseClassOOP1(10,500);
        System.out.println(grandTotal);
    }
}
//    public static void main(String[] args) {
//        Animal dog = new Animal();
//        dog.makeSound();
//    }
//}
//class Animal{
//    public void makeSound(){
//        System.out.println("Dog are barking");
//    }
//    public void speak(){
//        System.out.println("parrot are speaking");
//    }
//}
//class dog extends Animal{
//
//}


