import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {
	
	ArrayList<String> items;
	
	public ArrayListIterator(ArrayList<String> items) {
		this.items = items;
		
		Iterator<String> i = items.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

