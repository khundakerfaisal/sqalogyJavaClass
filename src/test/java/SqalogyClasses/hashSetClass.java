package SqalogyClasses;

import java.util.*;

public class hashSetClass {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(20);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(40);
        ArrayList<Integer> listSort=new ArrayList<>(set);       //Converted Array list for sorting
        Collections.sort(listSort);
        Integer [] listArray=listSort.toArray(new Integer[0]); //Array list converted to the array

        System.out.println("Print all Array list sort value :"+listSort);                           //Print all array sort data

        listSort.remove(Integer.valueOf(10));
        System.out.println("Print all Array list sort value with remove :"+listSort);                        //Print the array and remove the array data
        System.out.println("Print only the index value :" +listSort.get(0));                //Print the index array
        System.out.println("Print  Array value :" +Arrays.toString(listArray));     //Print all  array data
        System.out.println("Print only the index value for array :" +listArray[2]);                   //Print the index array

        HashSet<Integer> set1=new HashSet<>();
        set1.add(20);
        set1.add(30);
        set1.add(30);
        set1.add(40);
        set1.add(10);
        set1.add(25);
        System.out.println(set1);
        ArrayList<Integer> list=new ArrayList<>(set1); //Hashset converted into arraylist
        list.remove(1);                         //Remove one data from arraylist
        Collections.sort(list);                        //Sort array list
        System.out.println(list);                       //Print array list
        System.out.println(list.get(2));                //print index array data

    }
}
