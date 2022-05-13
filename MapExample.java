


package Practice;
import java.util.*;
import java.util.Map.Entry;
public class MapExample {
	public static void main(String[] args) {
		// map
		
		//HashMap
		HashMap<Integer,String> hm=new HashMap<>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Mary");    
	      hm.put(3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Entry<Integer, String> entry: hm.entrySet()) {    
	       System.out.println(entry);    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<>();  
	      
	      ht.put(4,"Ales");  
	      ht.put(5,"Rosy");  
	      ht.put(6,"Jack");  
	      ht.put(7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Entry<Integer, String> entry: ht.entrySet()) {    
		       System.out.println(entry);   
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlotte");    
	      map.put(10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Entry<Integer, String> entry: map.entrySet()) {    
		       System.out.println(entry);    
	      }    
	      
	   }  
}


