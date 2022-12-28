package datastructure;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// Create a queue
		Queue<String> queue = new LinkedList<>();

		// Add elements to the queue
		queue.add("Apple");
		queue.add("Banana");
		queue.add("Orange");


		System.out.println("Peek at the head of the queue: " + queue.peek()); // Output: "Peek at the head of the queue: Apple"


		System.out.println("Removed element: " + queue.remove()); // Output: "Removed element: Apple"


		System.out.println("Polled element: " + queue.poll()); // Output: "Polled element: Banana"


		System.out.println("Retrieving elements using for each loop:");
		for (String element : queue) {
			System.out.println(element);
		}


		System.out.println("Retrieving elements using while loop with iterator:");
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}

}
