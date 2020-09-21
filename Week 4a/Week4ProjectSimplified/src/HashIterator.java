import java.util.HashMap;

public class HashIterator {
	
	HashMap<String, String> dinner;
	
	public HashIterator(HashMap<String, String> dinner) {
		this.dinner=dinner;
		
		for(String i : dinner.keySet()) {
			System.out.println(i +": "+ dinner.get(i));

		}
	}

}
