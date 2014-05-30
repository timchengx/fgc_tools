import org.json.JSONArray;
import org.json.JSONObject;


public class main {
  public static void main(String[] args) {
    
    //login
    JSONObject json = new JSONObject();
    json.put("token", "kerkerker");
    json.put("gameID", "fgcChess");
    System.out.println(json.toString());
    
    //login result
    json = new JSONObject("{\"result\":false}");
    if(json.getBoolean("result"))
      System.out.println("TRUE!");
    else
      System.out.println("FALSE..");
    
    //user list
    JSONArray array = new JSONArray();
    array.put(new JSONObject("{\"id\":\"aaa\"}"));
    array.put(new JSONObject("{\"id\":\"bbb\"}"));
    array.put(new JSONObject("{\"id\":\"ccc\"}"));
    array.put(new JSONObject("{\"id\":\"ddd\"}"));
    System.out.println(array);
    
    //put user list(JSON array) into JSON object
    json = new JSONObject();
    json.put("result", true);
    json.put("list", array);
    System.out.println(json);
    
    //get user id from list
    JSONObject jsonID = (JSONObject)json.getJSONArray("list").get(2);
    System.out.println(jsonID); //print JSONObject where inside JSONArray
    System.out.println(jsonID.get("id"));
    
    //send invite request
    json = new JSONObject();
    json.put("invite", "timcheng");
    System.out.println(json.getString("invite"));
    
    //resultID 0
    json = new JSONObject("{\"resultID\":0}");
    System.out.println(json.getInt("resultID"));
    
    
    //result1 with id
    json = new JSONObject("{\"resultID\":1,\"id\":\"liquidT\"}");
    if(json.getInt("resultID") == 1)
      System.out.println(json.getString("id"));
    
    //response to resultID1
    json = new JSONObject();
    json.put("accept", true);
    System.out.println(json);
    
    //resultID2
    json = new JSONObject();
    json.put("resultID", 2);
    json.put("list", array);
    System.out.println(json);
    
    //step data
    json = new JSONObject();
    json.put("data", "let's go to somewhere...");
    json.put("PutItThere", true);
    System.out.println(json);
    
    //winner
    json = new JSONObject();
    json.put("winner", "timchengX");
    System.out.println(json);
    
    //server response
    json = new JSONObject();
    json.put("result", true);
    System.out.println(json.getBoolean("result"));
  }
}
