package Yusoof.TestngExample

import org.testng.annotations.AfterSuite
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeSuite
import org.testng.annotations.BeforeTest
import org.testng.annotations.Parameters
import org.testng.annotations.Test

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 27/09/13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
class TestngExample1 {
    @BeforeSuite
    void beforeSuite(){
        println "beforeSuite"
    }

    @AfterSuite
    void afterSuite(){
        println "afterSuite"
    }

    @BeforeTest
    void beforeTest(){
        println "beforeTest"
    }

    @AfterTest
    void afterTest(){
        println "afterTest"
    }
    @Parameters(["baseUrl"])
    @Test(enabled = false)
    void testParameters1(String baseurl){
       println baseurl
    }

    @Test(successPercentage = 0)
    void testTwo(){
        println "TestTwo"
    }
}
