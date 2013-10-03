package Yusoof.TestngExample.SuiteListener

import org.testng.ISuite
import org.testng.ISuiteListener

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 03/10/13
 * Time: 17:07
 * To change this template use File | Settings | File Templates.
 */
class ListenerExample implements ISuiteListener{
    @Override
    void onStart(ISuite suite) {
        println suite.name + " start"
    }

    @Override
    void onFinish(ISuite suite) {
        println suite.name + " end"
    }
}
