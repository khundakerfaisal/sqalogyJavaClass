import java.util.Scanner;

public class ExceptionHandaling {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the max number: ");
            int max=scanner.nextInt();
            System.out.println("Enter the min number: ");
            int min=scanner.nextInt();
            System.out.println("The random number is: "+(int)(Math.random()*(max-min+min)));
        }
        catch (Exception e){
            System.out.println("You have entered double number.Please try integer number");
        }
        finally {
            System.out.println("your are exited from the program");
        }
    }
}
