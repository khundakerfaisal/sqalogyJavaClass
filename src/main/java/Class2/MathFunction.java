package Class2;

public class MathFunction {
    public static void main(String[] args) {
        double a=9.00;
        double b=7.00;
        System.out.println("Square Value is: "+Math.sqrt(a));
        System.out.println("Maximum Value is: "+Math.max(a,b));
        System.out.println("Minimum Value is: "+Math.min(a,b));


        double generateNumber=Math.random()*100;
        System.out.println("Random number is "+generateNumber);
        System.out.println("Floor number is "+Math.floor(generateNumber));
        System.out.println("Ceil number is "+Math.ceil(generateNumber));
        System.out.println("Round number is "+Math.round(generateNumber));

    }
}
