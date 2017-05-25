import java.util.List;

import redis.clients.jedis.Jedis; 

public class JavaList
{ 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      
      //store data in redis list 
      jedis.lpush("manju-list", "one"); 
      jedis.lpush("manju-list", "two"); 
      jedis.lpush("manju-list", "three"); 
      // Get the stored data and print it 
      List<String> list = jedis.lrange("manju-list", 0 ,2); 
      for(int i = 0; i<list.size(); i++) { 
         System.out.println("Stored list in redis:: "+list.get(i)); 
      } 
   } 
} 