import java.util.Collections;
import java.util.HashMap;

public class HashMapDemo {
	String bikenname;
	int price;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<String, Integer> bikes = new HashMap<>();
     bikes.put("royalEnfield", 175000);
     bikes.put("yamaha", 100000);
     bikes.put("honda", 80000);
     bikes.keySet().stream().forEach(System.out::println);
     for( String key :bikes.keySet()) {
    	 System.out.println(key +" "+bikes.get(key));

     }
	}

}
