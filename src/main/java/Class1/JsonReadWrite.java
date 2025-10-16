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
        int countNumber=0;
        int generateNumber=2;
        String generateUserName="";
        JSONParser parser=new JSONParser();
        JSONArray lastNameArray= (JSONArray) parser.parse(new FileReader(fileName));
        if (!lastNameArray.isEmpty()){
            JSONObject lastNameObject= (JSONObject) lastNameArray.get(lastNameArray.size()-1);
            String lastUserName=lastNameObject.get("lastUserName").toString();
            countNumber= Integer.parseInt(lastUserName.replace(prefixName,""));

        }
        else {
            System.out.println("User Created  successfully");
        }

        for (int i=1;i<=generateNumber;i++){
          generateUserName=prefixName+(countNumber+i) ;
//            System.out.println(generateNumber);
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
