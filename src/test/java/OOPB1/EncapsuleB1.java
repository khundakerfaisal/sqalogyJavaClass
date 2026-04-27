package OOPB1;

public class EncapsuleB1 {
    public  String name="khan";

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private  int age;

    public static void main(String[] args) {
        EncapsuleB1 encapsuleB1=new EncapsuleB1();
        System.out.println(encapsuleB1.name);
         encapsuleB1.setAge(20);
        System.out.println(encapsuleB1.getAge());


    }
}
