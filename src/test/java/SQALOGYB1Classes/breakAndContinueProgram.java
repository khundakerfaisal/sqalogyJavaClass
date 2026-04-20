package SQALOGYB1Classes;

public class breakAndContinueProgram {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("Break program : " + i);
        }
        for (int i = 0; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("continue program : " + i);
        }
    }
}
