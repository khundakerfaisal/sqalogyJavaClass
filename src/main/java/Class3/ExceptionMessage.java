package Class3;

public class ExceptionMessage {
    public static void main(String[] args) {
        try {
            int num = 10 / 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
