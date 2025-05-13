package SqalogyClasses;

import java.util.Random;
import java.util.Scanner;

public class operatorClass {
    public static void main(String[] args) {
// ----------   Start Arithmetic operator Class-----------------//
            //            int a =5;
            //            int b =7;
            //
            //            int sum=a+b;
            //            int diff=a-b;
            //            int multiply=a*b;
            //            int div=a/b;
            //            int modulo=a%b;
            //
            //            System.out.println(sum);
            //            System.out.println(diff);
            //            System.out.println(multiply);
            //            System.out.println(div);
            //            System.out.println(modulo); //found Reminder value

//-------- End Arithmetic operator Class-------------------------//


//-----------------Assignment Operator----------------//
        //------Uniary operator-------------------//
            //        int numb=8;
            //        System.out.println("Unary operator");
            //        System.out.println(numb++); //value change After print 2nd time
            //        System.out.println(numb);//value changes after increment
            //        System.out.println(++numb);//value change first time
            //        System.out.println(numb--);//value change After print 2nd time
            //        System.out.println(numb);//value changes after Decrement
            //        System.out.println(--numb);//value changes after decrement

        //------End Uniary operator-------------------//
//-----------------Assignment Operator End----------------//



// ------------------Math Class start-----------------------//
            //        System.out.println(Math.max(5,6));
            //        System.out.println(Math.min(5,6));
            //        System.out.println((int)(Math.random()*100));
// ------------------Math Class End-----------------------//



// ------------------Input from system  start-----------------------//


            //        Scanner sc= new Scanner(System.in);
            //        System.out.println("Please input the number");
            //        String name=sc.nextLine();
            //        System.out.println(name);
// ------------------Input from system  End-----------------------//


//-------------------------------Comparison operator Start------------------------//
        //comparison operators
            //a==b;
            //a!=b;
            //a<b
            //a>b
            //a<=b
            //a<=b
        // Example1:
            //boolean isSunRaise=false;
            //if (isSunRaise==true){
            //    System.out.println("Day");
            //}
            //else {
            //    System.out.println("Night");
            //}

        // Example2:
            //int age=20;
            //if (age>18){
            //    System.out.println("can vote");
            //}
            //else {
            //    System.out.println("can't vote");
            //}


// -------------------------------Comparison operator End------------------------//



//-------------------------------Logical operator Start------------------------//
        //LogicL oPERATOR
        //&&
        // Example1:
            //        int a=30;
            //        int b=40;
            //        if (a<50 && b<50){
            //            System.out.println("Both leass than 50");
            //        }
        // Example2:
            //        int d=60;
            //        int e=40;
            //        if (d<50 || e<50){
            //            System.out.println("one less than 50");
            //        }
        // Example3:
            //        boolean isAdult =true;
            //        if (isAdult==true){
            //            System.out.println("is adult");
            //        }
            //        else{
            //            System.out.println("not adult");
            //        }


//-------------------------------Logical operator Start------------------------//
        Random random=new Random();
        int autoNumber=random.nextInt(90000)+10000;
        String prefix="4q5s";
        String generateRef= (prefix+autoNumber);
        System.out.println(generateRef);
    }
}
