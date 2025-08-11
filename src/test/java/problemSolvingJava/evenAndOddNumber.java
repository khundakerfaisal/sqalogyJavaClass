package problemSolvingJava;

public class evenAndOddNumber {
    public int evenAndOddNumber(int number){
        return number;
    }
    public static void main(String[] args) {
        evenAndOddNumber evenAndOddNumber=new evenAndOddNumber();
        int numberMatch=evenAndOddNumber.evenAndOddNumber(6);

//        for (int i=0;i<=numberMatch;i++){
//            if (i%2==0){
//                System.out.println("Print Then Even Number :" +i);
//            }
//            else {
//                System.out.println("Print the odd number :" +i);
//            }
          while (true){
            if (numberMatch%2==0){
                System.out.println("Print Then Even Number :" +numberMatch);
                break;
            }
            else {
                System.out.println("Print the odd number :" +numberMatch);
                break;
            }
        }
    }
}
