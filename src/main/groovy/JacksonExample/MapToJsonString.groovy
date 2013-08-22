package JacksonExample

import com.fasterxml.jackson.databind.ObjectMapper

class MapToJsonString {
    public static void main(String ...args){
        Map<String, String> map = new HashMap<>();
        map.put("name", "Yusoof")
        map.put("age", "29")
        println map
        String json = ""
        json = new ObjectMapper().writeValueAsString(map)
        println json
    }
}
