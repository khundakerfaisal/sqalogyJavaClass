package Class1;

public class LocalVariable {
    public void showAge() {
        int age = 30; //local variable
        System.out.println(age);
    }

    public static void main(String[] args) {
        LocalVariable localVariable=new LocalVariable();
        localVariable.showAge();

    }
}
