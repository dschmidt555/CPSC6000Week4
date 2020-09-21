import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayListClass arrayListClass = new ArrayListClass();
		ListClass listClass = new ListClass();
		HashClass hashClass = new HashClass();
		

		System.out.println("***Breakfast Menu***");
		ArrayListIterator arrayListIterator = new ArrayListIterator(arrayListClass.breakfast);
		System.out.println("***Lunch Menu***");
		ArrayIterator arrayIterator = new ArrayIterator(listClass.lunch);
		System.out.println("***Dinner***");
		HashIterator hashIterator = new HashIterator(hashClass.dinner);
		
		
		
		
		

	}

}
