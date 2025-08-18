package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonReadWriteManupulateNew {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/test/resources/createUser.json";
        String userName="UserName-";
        int numberCount=2;
        int lastNumber=0;
        JSONParser parser=new JSONParser();
        JSONArray lastArray= (JSONArray) parser.parse(new FileReader(filePath));
        if (!lastArray.isEmpty()){
        JSONObject lastAddedObject= (JSONObject) lastArray.get(lastArray.size()-1);
        String lastName=lastAddedObject.get("lastUserName").toString();
        lastNumber= Integer.parseInt(lastName.replace(userName,""));
        }

        for (int i=0;i<=numberCount;i++){
            String generateUsername=userName+(lastNumber+i);
            System.out.println(generateUsername);
            JSONObject lastObject=new JSONObject();
            lastObject.put("lastUserName",generateUsername);
            lastArray.add(lastObject);
        }



        FileWriter writer=new FileWriter(filePath);
        writer.write(lastArray.toJSONString());
        writer.flush();

    }
}
