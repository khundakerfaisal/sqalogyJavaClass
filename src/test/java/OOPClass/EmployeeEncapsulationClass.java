package OOPClass;

import java.security.PrivateKey;

public class EmployeeEncapsulationClass {
    public String Name;
    private int Nid;
    private int AccountNumber;
    private int Salary;

    public String getBachelorDegree() {
        return BachelorDegree;
    }

    public void setBachelorDegree(String bachelorDegree) {
        BachelorDegree = bachelorDegree;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    private String BachelorDegree;
    private int year;

    public int getNid() {
        return Nid;
    }

    public void setNid(int nid) {
        Nid = nid;
    }

    public int getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        AccountNumber = accountNumber;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public void empDetails(){


    }

    public static void main(String[] args) {
        EmployeeEncapsulationClass profile=new Profile();
        profile.empDetails();

    }
}
class Profile extends EmployeeEncapsulationClass{
    public void empDetails(){
        EmployeeEncapsulationClass eec=new EmployeeEncapsulationClass();
        eec.Name="mamun";
        eec.setNid(102254111);
        eec.setAccountNumber(15485221);
        eec.setSalary(5000);
        System.out.println(eec.Name);
        System.out.println(eec.getNid());
        System.out.println(eec.getAccountNumber());
        System.out.println(eec.getSalary());
    }

}
class EducationBackground extends EmployeeEncapsulationClass{
    public  void empDetails(){
        EmployeeEncapsulationClass eec=new EmployeeEncapsulationClass();
        eec.setBachelorDegree("Bsc in CSE");
        eec.setYear(2022);
        System.out.println(eec.getBachelorDegree());
        System.out.println(eec.getYear());
    }

}


