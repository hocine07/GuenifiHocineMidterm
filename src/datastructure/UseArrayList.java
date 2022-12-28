package datastructure;
import java.util.ArrayList;
public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList<String> colors = new ArrayList<>();


		colors.add("White");
		colors.add("Yellow");
		colors.add("Green");


		System.out.println("First element: " + colors.get(0));


		colors.remove(1);


		System.out.println("Elements in the ArrayList:");
		for (String color : colors) {
			System.out.println(color);
		}


		System.out.println("Elements in the ArrayList (iterator):");
		for (int i = 0; i < colors.size(); i++) {
			System.out.println(colors.get(i));
		}
	}
}
	




