package SqalogyClasses;

public class reverseNewClass {
    public static void main(String[] args) {
        String name="Stein";
        char ch=0;
        String Reverse="";
//        StringBuilder sb=new StringBuilder(name);
//        String reverseName=sb.reverse().toString();
//        System.out.println(reverseName);
        for (int i=name.length()-1;i>=0;i--){
            ch=name.charAt(i);
            Reverse+=ch;
        }
        System.out.println(Reverse);


    }
}
