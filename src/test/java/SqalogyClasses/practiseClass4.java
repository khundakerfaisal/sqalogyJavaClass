package SqalogyClasses;

import java.util.HashMap;

public class practiseClass4 {
    public static void main(String[] args) {
        HashMap<String,Integer> mapValue=new HashMap<>();
        mapValue.put("Tahmid",30);
        mapValue.put("Steyn",35);
        mapValue.put("Mahbub",30);
        mapValue.put("arif",40);
        mapValue.put("anik",25);
        System.out.println("Print Hash map value " +mapValue);
        System.out.println("Get one value from the array "+mapValue.get("Tahmid"));
        System.out.println("Remove one value " +mapValue.remove("Tahmid"));
        System.out.println("Replace one value " +mapValue.replace("Tahmid",30,32));
        System.out.println("Print value After replace " +mapValue);

    }
}
