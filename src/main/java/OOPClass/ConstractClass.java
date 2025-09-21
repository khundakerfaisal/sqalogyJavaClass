package OOPClass;

public class ConstractClass {

    private int vat;
    public  ConstractClass(int vat){
        this.vat=vat;
    }
    public static void main(String[] args) {
        ConstractClass constractClass=new ConstractClass(15);
        int totalSalary=constractClass.calculateSalary(1,100);
        System.out.println(totalSalary);

    }

    public int calculateSalary(int qty,int price){
        int totalPrice=((qty*price)+(qty*price)*vat/100);
        return totalPrice;
    }
}
