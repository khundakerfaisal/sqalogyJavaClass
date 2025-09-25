package Class4;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            if(i==5){
                break;
            }
            System.out.println("Print value is : "+i);
        }
        for (int i=0;i<10;i++){
            if(i==5){
                continue;
            }
            System.out.println("Print value is : "+i);
        }
    }
}
