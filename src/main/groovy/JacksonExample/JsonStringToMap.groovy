package JacksonExample

import com.fasterxml.jackson.core.type.TypeReference
import com.fasterxml.jackson.databind.ObjectMapper

class JsonStringToMap {
    public static void main(String ...args){
        String jsonString = "{\"name\": \"yusoof\", \"age\": \"29\"}"
        HashMap<String, String> map = new HashMap<String, String>();
        ObjectMapper mapper = new ObjectMapper()
        map = mapper.readValue(jsonString, new TypeReference<HashMap<String, String>>(){})
        println map.name
        println map.age
    }
}
