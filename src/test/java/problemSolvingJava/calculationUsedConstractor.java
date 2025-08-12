package problemSolvingJava;

public class calculationUsedConstractor {
    public calculationUsedConstractor(){
        System.out.println("Name is the company is CG-Confidence Group");
    }

    public int calculationUsedConstractor(int qty, int amount){
        return qty*amount;
    }

    public static void main(String[] args) {
        calculationUsedConstractor calculationUsedConstractor=new calculationUsedConstractor();
        int Total_Amount=calculationUsedConstractor.calculationUsedConstractor(30,500);
        System.out.println(Total_Amount);
//        new calculationUsedConstractor();

    }
}
