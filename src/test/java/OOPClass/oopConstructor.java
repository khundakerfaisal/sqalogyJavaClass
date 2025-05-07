package OOPClass;



public class oopConstructor {

    public oopConstructor(){
        System.out.println("Print successfully");
    }

    public int oopConstructor(int price, int qty){
       int totalPrice=(price*qty);
       return totalPrice;
    }



    public static void main(String[] args) {
        oopConstructor oopConstructor=new oopConstructor();
        int subTotal=oopConstructor.oopConstructor(10,5);
        System.out.println(subTotal);
    }

}
