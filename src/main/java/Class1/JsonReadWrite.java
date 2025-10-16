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
        String userName="UserName-7";
        JSONParser parser=new JSONParser();
        JSONArray lastNameArray= (JSONArray) parser.parse(new FileReader(fileName));
        JSONObject lastObject=new JSONObject();

        lastObject.put("lastUserName",userName);
        lastNameArray.add(lastObject);
        FileWriter writer=new FileWriter(fileName);
        writer.write(lastNameArray.toJSONString());
        writer.flush();
        writer.close();
    }
}
