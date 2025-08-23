package problemSolvingJava;

public class evenNumberFromMethod {
    public void getEvenNumber(int number) {

            if (number % 2 == 0) {
                System.out.println("Print even Number" + number);

            } else {
                System.out.println("Print odd Number" + number);

            }

    }

    public static void main(String[] args) {
        evenNumberFromMethod evenNumberFromMethod = new evenNumberFromMethod();
        evenNumberFromMethod.getEvenNumber(7);

    }
}
