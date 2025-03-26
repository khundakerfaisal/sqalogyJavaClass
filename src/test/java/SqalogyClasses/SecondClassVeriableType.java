package SqalogyClasses;

public class SecondClassVeriableType {
    String stname="namiha";

        //byte - 1 [-128 to 127 ]
        //short - 2
        //int - 4 [1,2,3]
        //long -8,
        //float-4 [3.14]
        //double-8
        //char -2 [a,b,c]
        //boolean- 1 [True /False]

    /* Added veriable type Example*/
    /* Premative datatype */
        //    byte age =30;
        //
        //    int phone=1234567890;
        //    long phoneNumber =12345678900L; //If long in the end of the number added "L"
        //    float pi=3.14F;//If Float in the end of the number added "F"
        //    char letter='@';
        //    boolean isAdult= true;

    /* End veriable type Example*/

    public static void main(String[] args) {
        /* Start Non-Premative datatype */
        String names="nameha";
        String stnames=new String(names);
        System.out.println(stnames.length());
        /* End Non-Premative datatype */

        /* Start Concanetaion  */

        String name1="xyz";
        String name2="khan";
//      String FullName=name1+name2;
//      System.out.println(FullName);
        String FullName2=name1+ " "+name2;//Name concanet
        System.out.println(FullName2);
        /* End Concanetaion  */

        String nameP="khan";
        System.out.println(nameP.charAt(0));//Number of position of character
        System.out.println(nameP.length());//Number of name length
        String NamePersonal=nameP.replace("k","s");//Word replace
        System.out.println(NamePersonal);
        System.out.println(nameP.substring(0,2));//Name of position index

    }




}
