package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class jsonReadWriteb1 {
    public static void main(String[] args) throws IOException, ParseException {

        String filePath = "src/test/resources/createName.json";
        String prefixName = "Faisal-";
        int autoGenerateCount = 2;

        int lastNumber = 0;
        String generateUsername = "";


        JSONParser parser = new JSONParser();
        JSONArray nameArray;
//        File file = new File(filePath);
//
//        // file empty হলে initialize
//        if (!file.exists() || file.length() == 0) {
//            try (FileWriter writer = new FileWriter(file)) {
//                writer.write("[]");
//            }
//        }
        nameArray = (JSONArray) parser.parse(new FileReader(filePath));
        if (!nameArray.isEmpty()) {
            JSONObject lastNameObj = (JSONObject) nameArray.get(nameArray.size() - 1);
            String lastName = (String) lastNameObj.get("name");
            if (lastName != null && lastName.startsWith(prefixName)) {
                lastNumber = Integer.parseInt(lastName.substring(prefixName.length()));
            }

        } else {
            System.out.println("Create New user successfully !!!");
        }
        for (int i = 1; i <= autoGenerateCount; i++) {
            generateUsername = prefixName + (lastNumber + i);
            JSONObject nameObj = new JSONObject();
            nameObj.put("name", generateUsername);
            nameArray.add(nameObj);

        }

        FileWriter writer = new FileWriter(filePath);
        writer.write(nameArray.toJSONString());
        writer.flush();
        writer.close();

    }
}

