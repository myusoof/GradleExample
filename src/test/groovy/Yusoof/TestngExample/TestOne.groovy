package Yusoof.TestngExample

import org.apache.http.client.HttpClient
import org.testng.annotations.Parameters
import org.testng.annotations.Test

/**
 * Created with IntelliJ IDEA.
 * User: ee
 * Date: 19/08/13
 * Time: 12:32
 * To change this template use File | Settings | File Templates.
 */
class TestOne {

    @Parameters(["baseUrl"])
    @Test()
    void parameterTest(String baseUrl){

        println baseUrl
    }

    @Test
    void testOneMethod(){
        println "test"

    }
}
