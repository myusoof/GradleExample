package JacksonExample

import com.fasterxml.jackson.core.JsonEncoding
import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonGenerator
import net.sf.json.JSONObject

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 8/21/13
 * Time: 10:09 PM
 * To change this template use File | Settings | File Templates.
 */
class JsonGeneratorExample {
    public static void main(String ...args){
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator generator = jsonFactory.createGenerator(new File("./user1.json"),JsonEncoding.UTF8)
        generator.writeStartObject();
        generator.writeBooleanField("Great", true)
        generator.writeBooleanField("Great1", true)
        generator.writeStartArray()
        generator.writeEndArray()
        generator.writeEndObject()
        generator.close()

/*        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.print(obj);*/
    }
}
