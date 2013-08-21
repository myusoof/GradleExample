package JacksonExample.HTTPExample

import com.fasterxml.jackson.core.JsonFactory
import groovyx.net.http.HttpResponseDecorator
import groovyx.net.http.RESTClient
import org.apache.http.HttpRequest
import org.apache.http.HttpResponse
import sun.org.mozilla.javascript.internal.json.JsonParser

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 8/22/13
 * Time: 12:00 AM
 * To change this template use File | Settings | File Templates.
 */
class HttpExample1 {
    public static void main(String ...args){
        RESTClient restClient = new RESTClient("")
        restClient.setHeaders(['X-TouchPoint': 'agent', 'X-Channel': 'VoiceUpgrade','X-UserId': 'someAgentId', 'X-IdType': 'WebSealAccessManagerUserId', 'X-PartnerId': 'o2_in'])
        HttpResponseDecorator response = (HttpResponseDecorator)restClient.get(path: "http://localhost:8080/customerService/customers;type=msisdn/449999999999")
        println response.data.identityUID

    }
}
