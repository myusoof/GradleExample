package Yusoof.TestngExample.RestClientExample

import com.fasterxml.jackson.core.JsonFactory
import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.MappingJsonFactory
import groovyx.net.http.ContentType
import groovyx.net.http.ParserRegistry
import groovyx.net.http.RESTClient
import org.apache.http.HttpEntity
import org.apache.http.HttpResponse

/**
 * Created with IntelliJ IDEA.
 * User: yusoof
 * Date: 8/19/13
 * Time: 11:07 PM
 * To change this template use File | Settings | File Templates.
 */
class RestClient extends RESTClient{
      RestClient(Object defaultURI){
        super(defaultURI)
        encoder.charset = "UTF-8"
          JsonFactory jsonFactory = new MappingJsonFactory()
          parser[ContentType.JSON] = { HttpResponse resp ->
              JsonParser parser = jsonFactory.createParser(resp.entity.content)
              parser.readValueAs(Object.class)
          }
          handler.failure = {resp ->
              HttpEntity entity = resp.getEntity();
              if (entity == null || entity.getContentLength() == 0) {
                  return resp
              }
              resp.setData(parseResponse(resp, ParserRegistry.getContentType(resp)))
              resp
          }

      }

}
