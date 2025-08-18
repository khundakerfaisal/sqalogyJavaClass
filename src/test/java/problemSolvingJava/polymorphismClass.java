package problemSolvingJava;

public class polymorphismClass {
    public void getSalary(int hour,int amount ){
        int grossAmount=hour*amount;
        System.out.println(grossAmount);
    }
    public void getSalary(int hour,int amount,int overtime ){
        int grossAmount=((hour*amount)+overtime);
        System.out.println(grossAmount);
    }

    public static void main(String[] args) {
        polymorphismClass polymorphismClass=new polymorphismClass();
        polymorphismClass.getSalary(8,500,300);
    }
}
