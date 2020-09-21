

public class ArrayIterator {
	
	String[] items;
	
	public ArrayIterator(String[] items) {
		this.items = items;
		
		for(int i=0; i<items.length; i++) {
			System.out.println(items[i]);
		}
	}

}
