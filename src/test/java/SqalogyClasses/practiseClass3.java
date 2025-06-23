package SqalogyClasses;

import java.util.*;

public class practiseClass3 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String generateNumber= String.valueOf(Math.round(Math.random()*100));
//        System.out.println(generateNumber);
//
//        String inputNumber = "";
//
//        while (!inputNumber.equals(generateNumber)){
//            System.out.println("Input Number :");
//            String InputNumber=sc.nextLine();
//            if (InputNumber.equals(generateNumber)){
//                System.out.println("Yahoo!! You are input correct Number");
//            }else {
//                System.out.println("Your are input wrong number");
//            }
//        }

//        int inatializeNumber=5;
//
//            for(int i=0;i<=inatializeNumber;i++){
//                System.out.println("Print Number is :" +i);
//            }
//
//
////            while (inatializeNumber<10){
////                System.out.println("while print value is " +inatializeNumber);
////                inatializeNumber++;
////            }
//
//            do{
//                System.out.println("do-while print value is " +inatializeNumber);
//                inatializeNumber++;
//            }while (inatializeNumber<=8);

//       for (int i=0;i<=5;i++){
//           if (i==4){
//               continue;
//           }
//           System.out.println("Print the continue program value "+i);
//       }
//
//        for (int i=0;i<=5;i++){
//            if (i==5){
//                break;
//            }
//            System.out.println("Print the break program value " +i);
//        }

        HashSet<Integer> set=new HashSet<>(); //Hashmap program
        set.add(20);
        set.add(10);
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println(set);
        ArrayList<Integer> listData=new ArrayList<>(set);
        Collections.sort(listData);
        System.out.println(listData.get(1));
        System.out.println(listData.remove(0));
        System.out.println(listData);

        String  name="Farisha"; //Reverse string program
        char [] reverse=name.toCharArray();
        String reverseName="";
        for (int i=reverse.length-1;i>=0;i--)
        {
            reverseName+=reverse[i];
        }
        System.out.println(reverseName);

        int[] number={30,20,40}; //Array Sort
        for (int i=0;i<number.length;i++){
            for (int j=i+1;j<number.length;j++){
                if (number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));






    }

}
