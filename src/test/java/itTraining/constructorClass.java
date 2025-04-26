package itTraining;

public class constructorClass {
    private int vat;
    public constructorClass(int vat){
        this.vat=vat;
    }
    public int constructorClass(int qty,int price){
        int totalPrice=((qty*price)+(qty*price)*vat/100);
        return totalPrice;

    }
    public static void main(String[] args) {
        constructorClass calculatePrice=new constructorClass(15);
        int totalPrice=calculatePrice.constructorClass(1,100);
        System.out.println(totalPrice);

    }

}
