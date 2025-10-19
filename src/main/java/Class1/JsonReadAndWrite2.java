package Class1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReadAndWrite2 {
    public static void main(String[] args) throws IOException, ParseException {
        String filePath="src/main/resources/User.json";
        String prefix="User-";
        int lastCountNumber=0;
        int generateNumber=1;
        String generateAutoNumber="";
        JSONParser parser=new JSONParser();
        JSONArray lastUserArray= (JSONArray) parser.parse(new FileReader(filePath));
        if (!lastUserArray.isEmpty()){
           JSONObject lastAddedObj= (JSONObject) lastUserArray.get(lastUserArray.size()-1);
           String lastUserName=lastAddedObj.get("userName").toString();
           lastCountNumber= Integer.parseInt(lastUserName.replace(prefix,""));
        }
        for (int i=1;i<=generateNumber;i++){
            generateAutoNumber= prefix+(lastCountNumber+i);
            JSONObject lastUserObj=new JSONObject();
            lastUserObj.put("userName",generateAutoNumber);
            lastUserArray.add(lastUserObj);

        }

        FileWriter writer=new FileWriter(filePath);
        writer.write(lastUserArray.toJSONString());
        writer.flush();
        writer.close();
    }
}
//[{"userName":"User-1"},{"userName":"User-2"}]