package OOPClass;

public class PerameterizedConstract {
    public int overtime;
    public PerameterizedConstract(int overtime){
        this.overtime=overtime;

    }
    public int getSalary(int salary,int hour){
        int totalSalary=(salary*hour+overtime);
        return totalSalary;
    }
    public static void main(String[] args) {
        PerameterizedConstract pc=new PerameterizedConstract(5000);
        int grossSalary=pc.getSalary(1000,6);
        System.out.println(grossSalary);

    }
}
