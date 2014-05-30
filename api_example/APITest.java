import java.util.LinkedList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;



public class APITest {
  public static void main(String[] args) throws Exception {
    HttpClient client = new DefaultHttpClient();
    
    List<NameValuePair> params = new LinkedList<NameValuePair>();
    params.add(new BasicNameValuePair("username", "kerker@fcu.edu.tw"));
    params.add(new BasicNameValuePair("password", "kerkerker"));
    params.add(new BasicNameValuePair("gameID", "fgcChess"));
    UrlEncodedFormEntity urlEntity = new UrlEncodedFormEntity(params, HTTP.UTF_8);
    
    HttpPost postAction = new HttpPost("http://fgc.heapthings.com/api/getToken");
    postAction.setEntity(urlEntity);

    HttpResponse responsePOST = client.execute(postAction);
    HttpEntity resEntity = responsePOST.getEntity();
    
    String response = EntityUtils.toString(resEntity);
    System.out.println(response);
  }
}
