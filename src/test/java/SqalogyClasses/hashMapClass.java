package SqalogyClasses;

import java.util.HashMap;

public class hashMapClass {
    public static void main(String[] args) {
        HashMap<String,Integer> mapData=new HashMap<>();
        mapData.put("Tahmid",30);
        mapData.put("Samira",20);
        mapData.put("Arman",40);
        mapData.put("Mamun",50);
        mapData.put("Zahid",30);
        mapData.put("Mahbub",60);
        System.out.println("Print all data " +mapData);                               //Get all json key value data
        mapData.remove("Arman",40);                                //Remove the data
        System.out.println("Print only remove data" +mapData);
        mapData.replace("Mahbub",60,45);    //Replace the data
        System.out.println("Print only replace data" +mapData);
        Integer getData=mapData.get("Mamun");                     //Get only one index data
        System.out.println("Get only one index from the data" +getData);

    }
}
