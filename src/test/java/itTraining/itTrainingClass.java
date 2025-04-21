package itTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class itTrainingClass {
    //Static block ->static,Non static->object
    static {
        System.out.println("Always execute first static then execute main method .......");
    }

    public void sum(int a,int b){
        System.out.println("The Summation value is :" +(a+b));
    }
    public static void mull(int i,int j){
        System.out.println("The Multiply value is :" +(i*j));
    }

    public static void main(String[] args) {
//        mull(10,5);
        //1st class -1st Example
                //        Scanner sc=new Scanner(System.in);
                //        System.out.println("Enter the name");
                //        String name=sc.nextLine();
                //        System.out.println("Enter the number");
                //        int number1=sc.nextInt();
                //        System.out.println(name);//Print means same line and println means different line
                //        System.out.println("Your name is : " +name+ " your Desire number is :"+number1);
        //2nd class -1st example
                //        Scanner sc=new Scanner(System.in);
                //        System.out.println("Enter first name");
                //        String name=sc.nextLine();
                //        System.out.println("Enter second name");
                //        String name2=sc.nextLine();
                //        if (name.equals(name2)){
                //            System.out.println(name+ " and " +name2+ " are similar");
                //        }
                //        if (name.contains(name2)){
                //            System.out.println(name+ " and " +name2+ " are similar");
                //        }
                //        if (name.equalsIgnoreCase(name2)){
                //            System.out.println(name+ " and " +name2+ " are similar");
                //        }
        //2nd class -2nd example
            //Array
                //        String [] name={"abir","aman","aku","arif"};
                //        System.out.println(name[2]);
                //        for (int i=0;i<name.length;i++){
                //            System.out.println(name[i]);
                //        }

        //ArrayList
            //User Defined Input from array
                //            Scanner sc=new Scanner(System.in);
                //            ArrayList<String> names=new ArrayList<>();
                //            for (int i=0;i<=5;i++){
                //                System.out.println("Please input the name");
                //              names.add(i,sc.nextLine());
                //            }
                //            System.out.println(names);

            //Array list data add and remove example

                //            ArrayList<String> names=new ArrayList<>();
                //            names.add("aman");
                //            names.add("arif");
                //            names.add("adar");
                //            names.add("asif");
                //        System.out.println(names.size());
                //        for (int i=0;i<names.size();i++){
                //            System.out.println(names.get(i));
                //        }
                //        for (int i=0;i<names.size();i++){
                //        if (names.get(i).equals("aman")){
                //            names.remove(i);
                //            }
                //        }
                //        System.out.println(names);
        //2nd class -Method Example

                //                itTrainingClass itc=new itTrainingClass();
                //                itc.sum(10,20);
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name");
        ArrayList<String> names=new ArrayList<>();
        for (int i=0;i<=4;i++){
            names.add(i,input.nextLine());

        }
        System.out.println(names);
//        System.out.println(names.get(3));

    }

}
