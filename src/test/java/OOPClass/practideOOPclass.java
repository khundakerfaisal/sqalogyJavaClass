package OOPClass;

public class practideOOPclass {


    public int overtime;

    public int generateSalary(int hour, int salary) {
        int makeCalculation=hour*salary;
        return makeCalculation;
    }
    public int generateSalary(int hour,int salary,int overtime) {
        int makeCalculation=(hour*salary)+(overtime*salary);
        return makeCalculation;
    }
    public practideOOPclass(int overtime){
        this.overtime=overtime;

    }
    public static void main(String[] args) {
        practideOOPclass poc=new practideOOPclass(10);
        int totalSalary= poc.generateSalary(5,1000, poc.overtime);
        System.out.println(totalSalary);
//        Vahicle motor=new MotorCyle();
//        motor.wheel();
    }
}
//class Vahicle{
//    public void wheel(){
//        System.out.println("Bus has 4 wheel");
//    }
//}
//class MotorCyle extends Vahicle{
//    @Override
//    public void wheel(){
//        System.out.println("motor cycle has 2 wheel");
//    }

//}
