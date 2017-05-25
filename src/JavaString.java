import redis.clients.jedis.Jedis; 

public class JavaString { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //set the data in redis string 
      try
      {
      jedis.set("first string", "string value"); 
      // Get the stored data and print it 
      System.out.println("Stored string in redis:: "+ jedis.get("first string")); 
      }
      catch(Exception e){System.out.println(e);}} 
}
