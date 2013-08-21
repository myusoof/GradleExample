package JacksonExample

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 8/21/13
 * Time: 9:25 PM
 * To change this template use File | Settings | File Templates.
 */
class User {
    String name
    int age
    Long salary
    String address

    @Override
    String toString(){
        return name + age + salary + address
    }

}
