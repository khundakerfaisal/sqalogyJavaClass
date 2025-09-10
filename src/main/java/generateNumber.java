import java.util.Random;

public class generateNumber {
    public static void main(String[] args) {
        Random rand=new Random();

        int autoNumber=rand.nextInt(999999)+111111;
        String prefix="00188";
        String generateMobileNumber=prefix+autoNumber;
        System.out.println(generateMobileNumber);

    }
}
