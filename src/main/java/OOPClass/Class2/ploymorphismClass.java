package OOPClass.Class2;

public class ploymorphismClass {
    //Method Overloading
    public void sumOfAmount(int a,int b){
        int totalAmount=a+b;
        System.out.println("Sum of Amount is ::" +totalAmount);
    }
    public void sumOfAmount(int a,int b,int c){
        int totalAmount=a+b+c;
        System.out.println("Sum of Amount is ::" +totalAmount);
    }
    public static void main(String[] args) {
        ploymorphismClass ploymorphismClass=new ploymorphismClass();
        ploymorphismClass.sumOfAmount(5,4);
    }
}
