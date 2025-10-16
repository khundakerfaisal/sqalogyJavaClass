package Class1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReadWrite {
    public static void main(String[] args) throws IOException, ParseException {
        String fileName="src/test/resources/createUser.json";
        String prefixName="UserName-";
        int lastCountNumber=0;
        int generateNumber=1;
        String generateUserName="";
        JSONParser parser=new JSONParser();
        JSONArray lastNameArray= (JSONArray) parser.parse(new FileReader(fileName));
        if (!lastNameArray.isEmpty()){
            JSONObject lastAddedObj= (JSONObject) lastNameArray.get(lastNameArray.size()-1);
            String lastUserName=lastAddedObj.get("lastUserName").toString();
            lastCountNumber= Integer.parseInt(lastUserName.replace(prefixName,""));

        }
        for (int i=0;i<=generateNumber;i++){
            generateUserName=prefixName+(lastCountNumber+i);
            System.out.println(generateUserName);
            JSONObject lastObject=new JSONObject();
            lastObject.put("lastUserName",generateUserName);
            lastNameArray.add(lastObject);
        }

        FileWriter writer=new FileWriter(fileName);
        writer.write(lastNameArray.toJSONString());
        writer.flush();
        writer.close();
    }
}
