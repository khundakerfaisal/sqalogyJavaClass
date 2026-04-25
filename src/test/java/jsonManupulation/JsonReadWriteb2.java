package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class JsonReadWriteb2 {
    static String filePath = "src/test/resources/createName.json";

    static void createEmptyJsonArray(String filePath) {
        File file = new File(filePath);

        // যদি file না থাকে বা empty হয়
        if (!file.exists() || file.length() == 0) {
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("[]");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws IOException, ParseException {
        String prefixName = "customer-";
        int numberCount = 1;
        String autoGenerateNumber = "";
        int lastNumber = 0;


        JSONParser parser = new JSONParser();
        JSONArray nameArray;
        File file = new File(filePath);

        // যদি file না থাকে বা empty হয়
//        if (!file.exists() || file.length() == 0) {
//            try (FileWriter writer = new FileWriter(file)) {
//                writer.write("[]");
//            }
//    }
            createEmptyJsonArray(filePath);
            nameArray = (JSONArray) parser.parse(new FileReader(filePath));
            if (!nameArray.isEmpty()) {
                JSONObject lastJsonObj = (JSONObject) nameArray.get(nameArray.size() - 1);
                String lastName = (String) lastJsonObj.get("UserName");
                lastNumber = Integer.parseInt(lastName.substring(prefixName.length()));

            }
            for (int i = 1; i <= numberCount; i++) {
                autoGenerateNumber = prefixName + (lastNumber + i);
                JSONObject lastNameObj = new JSONObject();
                lastNameObj.put("UserName", autoGenerateNumber);
                nameArray.add(lastNameObj);
            }


            FileWriter writer = new FileWriter(filePath);
            writer.write(nameArray.toJSONString());
            writer.flush();
            writer.close();
        }
    }
