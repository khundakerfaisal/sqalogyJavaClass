package OOPB1;

public class overloadingb2 {
    public void sum(int a,int b){
        int sumOfAmount=a+b;
        System.out.println(sumOfAmount);
    }
    public void sum(int a,int b,int c){
        int sumOfAmount=a+b+c;
        System.out.println(sumOfAmount);
    }
    public void sum(int a,int b,int c,int d){
        int sumOfAmount=a+b+c+d;
        System.out.println(sumOfAmount);
    }
    public static void main(String[] args) {

        overloadingb2 overloadingb2=new overloadingb2();
        overloadingb2.sum(10,20);
    }
}
