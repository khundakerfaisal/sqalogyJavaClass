package OOPClass;

public class oopPolymorphisom {
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


    public static void main(String[] args) {

        salary Salary=new salary();
        int totalSalary =Salary.calculateSalary(10,500);
        System.out.println(totalSalary);


    }


}
class salary{
    public int calculateSalary(int hour,int price){
        return hour*price;
    }
    public int calculateSalary(int hour,int price,int overtime){
        return (hour*price)+(hour*overtime);
    }
}
