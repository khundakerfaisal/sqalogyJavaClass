package OOPB1;

public class OverLoadingB1 {

    public void number(int a,int b){
        int add=a+b;
        System.out.println(add);
    }
    public void number(int a,int b,int c){
        int add=a+b+c;
        System.out.println(add);
    }
    public void number(int a,int b,int c,int d){
        int add=a+b+c+d;
        System.out.println(add);

    }
    public static void main(String[] args) {
        OverLoadingB1 overLoadingB1=new OverLoadingB1();
        overLoadingB1.number(10,12,11);

    }
}
