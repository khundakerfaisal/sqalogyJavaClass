package jsonManupulation;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class jsonReadAndWriteNew {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/test/resources/createUser.json";
        String prefixName="UserName-";
        int lastUserCount=0;
        int userNameAdd=3;
        String generateNewUser="";

        JSONParser parser=new JSONParser();
        JSONArray lastUserArray= (JSONArray) parser.parse(new FileReader(filePath));

        if (!lastUserArray.isEmpty()){
            JSONObject lastUserObj= (JSONObject) lastUserArray.get(lastUserArray.size()-1);
            String lastUserName=lastUserObj.get("lastUserName").toString();
            lastUserCount= Integer.parseInt(lastUserName.replace(prefixName,""));

        }
        else {
            System.out.println("User Created First successfully");
        }


        for (int i=1;i<=userNameAdd;i++){
            generateNewUser=prefixName+(lastUserCount+i);
            System.out.println(generateNewUser);
            JSONObject findLastUserObject=new JSONObject();
            findLastUserObject.put("lastUserName",generateNewUser);
            lastUserArray.add(findLastUserObject);
        }

        FileWriter writer=new FileWriter(filePath);
        writer.write(lastUserArray.toJSONString());
        writer.flush();
        writer.close();











    }
}
