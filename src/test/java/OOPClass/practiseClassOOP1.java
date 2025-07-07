package OOPClass;

public class practiseClassOOP1 {

    private String empName;
    private String department;
    private int hour;
    private int amount;
    private int overtime;
    private int grossSalary;

    public int getGrossSalary(){
        return grossSalary;
    }

    public void setGrossSalary(int hour,int amount,int overtime){
        this.hour=hour;
        this.amount=amount;
        this.overtime=overtime;
        this.grossSalary=((hour*amount)+overtime);

    }

    public String getEmpName(){
        return empName;
    }



    public void setEmpName(String empName){
        this.empName=empName;

    }

    public static void main(String[] args) {
        practiseClassOOP1 pop=new practiseClassOOP1();
        pop.setEmpName("Mamun");
        System.out.println(pop.getEmpName());

        pop.setGrossSalary(8,1500,20);
        System.out.println(pop.getGrossSalary());
    }




//    private String empName;
//    private int grossSalary;
//    private int hour;
//    private int perDayAmount;
//    private int month;
//
//
//    public String getEmpName(){
//        return empName;
//    }
//    public void setEmpName(String empName){
//        this.empName=empName;
//    }
//
//    public int getGrossSalary(){
//        return grossSalary;
//    }
//    public void setGrossSalary(int hour,int perDayAmount,int month){
//        this.hour=hour;
//        this.perDayAmount=perDayAmount;
//        this.grossSalary=((hour*perDayAmount)*month);
//    }
//
//
//    public static void main(String[] args) {
//        practiseClassOOP1 poop1=new practiseClassOOP1();
//        poop1.setEmpName("Arman");
//        poop1.setGrossSalary(8,1500,26);
//        System.out.println("Emp name is : "+poop1.getEmpName());
//        System.out.println("Emp salary is : "+poop1.getGrossSalary());
//
//    }


}

    //        public practiseClassOOP1(){
//        System.out.println("Total Price Is showing successfully");
//    }
//    public int practiseClassOOP1(int qty, int price){
//        int totalPrice=qty*price;
//        return totalPrice;
//
//    }
//    public static void main(String[] args) {
//        practiseClassOOP1 pop1=new practiseClassOOP1();
//        int grandTotal=pop1.practiseClassOOP1(10,500);
//        System.out.println(grandTotal);
//    }
//}
//    public static void main(String[] args) {
//        Animal dog = new Animal();
//        dog.makeSound();
//    }
//}
//class Animal{
//    public void makeSound(){
//        System.out.println("Dog are barking");
//    }
//    public void speak(){
//        System.out.println("parrot are speaking");
//    }
//}
//class dog extends Animal{
//
//}


