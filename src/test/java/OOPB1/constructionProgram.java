package OOPB1;

public class constructionProgram {
//    constructionProgram(){
//      String name="Stein";
//        System.out.println(name);
//    }
    constructionProgram(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        new constructionProgram(10,20);
    }
}
