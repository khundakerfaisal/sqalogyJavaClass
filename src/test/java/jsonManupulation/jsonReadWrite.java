package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.text.html.parser.Parser;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonReadWrite {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath = "src/test/resources/createUser.json";
        int autoGenerateCount = 2;
        String prefixName = "UserName-";
        String generateUserName = "";
        int lastNumberCount = 0;

        JSONParser parser = new JSONParser();
        JSONArray lastNameArray = (JSONArray) parser.parse(new FileReader(filePath));

        if (!lastNameArray.isEmpty()) {
            JSONObject lastNameObj = (JSONObject) lastNameArray.get(lastNameArray.size() - 1);
            String lastName = (String) lastNameObj.get("lastUserName");
            lastNumberCount = Integer.parseInt(lastName.replace(prefixName, ""));
        } else {
            System.out.println("Create New user successfully !!!");
        }

        for (int i = 1; i <= autoGenerateCount; i++) {
            generateUserName = prefixName + (lastNumberCount + i);
            System.out.println(generateUserName);
            JSONObject lastGenerateObj = new JSONObject(); //if need to print all object
            lastGenerateObj.put("lastUserName", generateUserName);
            lastNameArray.add(lastGenerateObj);

        }
//        JSONObject lastGenerateObj = new JSONObject();//if need to print only last object
//        lastGenerateObj.put("lastUserName", generateUserName);
//        lastNameArray.add(lastGenerateObj);
        FileWriter writer = new FileWriter(filePath);
        writer.write(lastNameArray.toJSONString());
        writer.flush();
        writer.close();
    }
}
