package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonReadWritePrintAll {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName = "src/test/resources/createUser.json";
        String prefixName = "User-";
        int autoGenerateCount = 4;
        int lastGenerateNumber = 0;
        JSONParser parser = new JSONParser();
        JSONArray lastUserArray = (JSONArray) parser.parse(new FileReader(fileName));//Read the file
        String generateUsername = "";

        if (!lastUserArray.isEmpty()) { //Check the user name is empty or not
            JSONObject lastUserObject = (JSONObject) lastUserArray.get(lastUserArray.size() - 1); //Checking last added array object
            String lastUserName = (String) lastUserObject.get("lastUserName");//Checking last username
            lastGenerateNumber = Integer.parseInt(lastUserName.replace(prefixName, "")); //Replace last generate number
        }
        else {
            System.out.println("Create New user");
        }

        for (int i = 1; i <= autoGenerateCount; i++) {
            generateUsername = prefixName + (lastGenerateNumber + i);//Generate username
            System.out.println(generateUsername);
            //Addded all object in the array
            JSONObject userObj = new JSONObject();//Create json object
            userObj.put("lastUserName", generateUsername);//add json object
            lastUserArray.add(userObj);//put the json object in array

        }

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

