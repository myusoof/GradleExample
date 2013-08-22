package JacksonExample

import com.fasterxml.jackson.databind.ObjectMapper

class testOn2JavaToJson {
    public static void main(String ...args){
        User user = new User()
        ObjectMapper mapper = new ObjectMapper()
        user.age = 23
        user.name = "Yusoof"
        user.salary = 121212
        user.address = "test"
        mapper.writeValue(new File("./user2.json"), user)
        println "test"
        User user1 = mapper.readValue(new File("./user2.json"), User.class)
        println user1.age
    }
}
