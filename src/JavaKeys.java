import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCommands; 

public class JavaKeys { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //store data in redis list 
      // Get the stored data and print it
      try
      {
//      List<String> list = jedis.keys("*"); 
//     
//      for(int i = 0; i<list.size(); i++) { 
//         System.out.println("List of stored keys:: "+list.get(i)); 
//      
//      }
    	  Set<String> names = jedis.keys("*");

          java.util.Iterator<String> it = names.iterator();
          while(it.hasNext()) {
              String s = it.next();
              System.out.println(s + " : " + jedis.get(s));
          }
      }
      catch(Exception e){}
   } 
}