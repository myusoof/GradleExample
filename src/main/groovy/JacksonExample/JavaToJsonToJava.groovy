package JacksonExample

import com.fasterxml.jackson.databind.ObjectMapper

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 8/21/13
 * Time: 9:21 PM
 * To change this template use File | Settings | File Templates.
 */
class JavaToJsonToJava {
    public static void main(String ...args){
        ObjectMapper objectMapper = new ObjectMapper()
        User user = new User()
        user.name = "yusoof"
        user.age = 28
        user.salary = 8000000
        user.address = "no 5, seven wells st, seven wells, chennai -1"
        objectMapper.writeValue(new File("./user.json"), user)

        User user1 = objectMapper.readValue(new File("./user.json"), User.class)
        println user1.address
        println user1.salary
        println user1.name
        println user1.age
    }

}
