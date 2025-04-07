package SqalogyClasses;

public class castingClass {
    public static void main(String[] args) {
        double price =500.00; //Double type data
        double finalPrice=price+18; //Double type data+ int type data (If we input int type data --> to -->double type data this is called implicit casting)
        System.out.println("Implicit casting :"+finalPrice);

        int newPrice=100;//Int type data
        int newFinalPrice= (int) (newPrice+18.0);//int type data + Double type data (If we input double type data --> to -->int type data this is called Explicit  casting)
        System.out.println("Explicit casting :"+newFinalPrice);


    }
}
