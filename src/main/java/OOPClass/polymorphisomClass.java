package OOPClass;

public class polymorphisomClass {
    public static void main(String[] args) {
        Salary salary=new Salary();
        int empSalary=salary.calculateSalary(8,500);
        System.out.println(empSalary);

    }


}
class Salary{
    public int calculateSalary(int hour,int payment){
        return hour*payment;
    }
    public int calculateSalary(int hour,int payment,int overtime){
        return (hour*payment)+(hour*overtime);
    }
}
