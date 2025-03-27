package SqalogyClasses;

import java.util.Arrays;

public class arrayClass {
    public static void main(String[] args) {
        int age=30;
        int physics=97;
        int chem=98;
        int eng=95;
        int[] marks=new int[3];
        marks[0] =97;
        marks[1] =98;
        marks[2] =95;
        System.out.println(marks[2]);//Number of array index 2
        System.out.println(marks.length);//find Array lemgth
        System.out.println(marks[0]);
        Arrays.sort(marks);//Sort marks array value
        System.out.println(marks[0]);//print sort array value

        int[] classMarks={97,95,96};//one dimentional array
        int[][] FinalMarks={{97,95,98},{97,95,98}};//two dimentional array
        System.out.println(FinalMarks[1][2]);
    }
}
