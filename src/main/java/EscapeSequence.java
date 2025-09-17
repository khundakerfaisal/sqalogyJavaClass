public class EscapeSequence {
    public static void main(String[] args) {
        //Add a tab between word
        String name="Shah\nali";
        System.out.println(name);

       //Add a new line
        String newLine="Shah\tali";
        System.out.println(newLine);

        //Add a double quote
        String doubleQuote="Shah \"ali\"";
        System.out.println(doubleQuote);

        //Add a Back slash quote
        String singleBackslash="Shah \\ ali";
        System.out.println(singleBackslash);
    }
}
