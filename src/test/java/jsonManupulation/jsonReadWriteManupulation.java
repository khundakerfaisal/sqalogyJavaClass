package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import javax.swing.text.html.parser.Parser;
import java.io.*;

public class jsonReadWriteManupulation {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName = "src/test/resources/createUser.json";
        String prefixName = "User-";
        int autoGenerateCount = 4;
        int lastGenerateNumber = 0;
        JSONParser parser = new JSONParser();
        JSONArray lastUserArray = (JSONArray) parser.parse(new FileReader(fileName));
        String generateUsername = "";
        if (!lastUserArray.isEmpty()) {
            JSONObject lastUserObject = (JSONObject) lastUserArray.get(lastUserArray.size() - 1);
            String lastUserName = (String) lastUserObject.get("lastUserName");
            lastGenerateNumber = Integer.parseInt(lastUserName.replace(prefixName, ""));
        }
        else {
            System.out.println("Create New user");
        }

        for (int i = 1; i <= autoGenerateCount; i++) {
            generateUsername = prefixName + (lastGenerateNumber + i);//Generate username with prefix
            System.out.println(generateUsername);
        }
        // Create a JSON object for each user
        JSONObject userObj = new JSONObject();//Create json object
        userObj.put("lastUserName", generateUsername);//add json object
        // Add to the array
        lastUserArray.add(userObj);//put the json object in array

        // Write all usernames to JSON file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(lastUserArray.toJSONString());
            writer.flush();
            System.out.println("All new usernames written successfully.");
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
