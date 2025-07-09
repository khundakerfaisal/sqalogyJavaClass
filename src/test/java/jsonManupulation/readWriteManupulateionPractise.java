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

public class readWriteManupulateionPractise {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/test/resources/createUser.json";
        String prefixName="UserName-";
        int generateAutoNumber=1;
        int lastGenerateNumber=0;
        String generateUserName="";
        JSONParser parser=new JSONParser();
        JSONArray lastUserNameArray= (JSONArray) parser.parse(new FileReader(filePath));
        if (!lastUserNameArray.isEmpty()){
        JSONObject lastUserNameObj= (JSONObject) lastUserNameArray.get(lastUserNameArray.size()-1);
        String lastUserName=lastUserNameObj.get("lastUserName").toString();
        lastGenerateNumber= Integer.parseInt(lastUserName.replace(prefixName,""));
        }
        else {
            System.out.println("User Created First successfully");
        }
        for (int i=1;i<=generateAutoNumber;i++){
            generateUserName=prefixName+(lastGenerateNumber+i);
            System.out.println(generateUserName);
            JSONObject lastAddedObject=new JSONObject();
            lastAddedObject.put("lastUserName",generateUserName);
            lastUserNameArray.add(lastAddedObject);
        }
        FileWriter writer=new FileWriter(filePath);
        writer.write(lastUserNameArray.toJSONString());
        writer.flush();
        writer.close();

    }




}
