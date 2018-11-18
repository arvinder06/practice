package JsonPackage;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

public class JsonParser {

    static Map<String, String> allMappedKeyValues;

    public static void main(String[] args) throws IOException {
        //TODO:Replace with HTTP Response from Endpoint
        File file = new File("src/test/resources/json.json");
        final String jsonString = FileUtils.readFileToString(file, "UTF-8");

        JSONObject jSONObject = new JSONObject(jsonString);

        printJSONObject(jSONObject);


    }

    public static Map<String, Object> printJSONObject(JSONObject object){
        Map<String, Object> mapping = new HashMap<String, Object>();

        @SuppressWarnings("rawtypes")
        Iterator keys = object.keys();

        while (keys.hasNext()) {
            String key = (String) keys.next();
            Object item = object.opt(key);
            if (item instanceof JSONObject){

                //Recursive call if we come across a JSONObject inside.
                mapping.put(key, printJSONObject((JSONObject) item));

            }
            else if (item instanceof JSONArray){
                mapping.put(key, toVector((JSONArray) item));
            }

            else{
                allMappedKeyValues.put(key,object.opt(key).toString());
                System.out.println("key : " + key);
                System.out.println("value : " + object.opt(key).toString());
                
                //TODO: Check the HashMap key for auto_id or whatever
                //TODO: If the value is not empty add to list of ids to search for
                //TODO: get the text from the webpage using the ids to search for
                //TODO: search allMappedKeyValues for the key, get its value and compare to webpage text
            }
        }
        return mapping;
    }

    /*
     * Description: Same as above except for JSONArrays.
     */
    public static Vector<Object> toVector(JSONArray object){
        Vector<Object> array = new Vector<Object>();
        int object_len = object.length();
        for (int i = 0; i != object_len; ++i){
            Object item = object.opt(i);
            if (item instanceof JSONArray){
                array.add(toVector((JSONArray) item));
            }
            else if(item instanceof JSONObject){
                array.add(printJSONObject((JSONObject) item));
            }
            else{
                array.add(item);
            }
        }
        return array;
    }
}

