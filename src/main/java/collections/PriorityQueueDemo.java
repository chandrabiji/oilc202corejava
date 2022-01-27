package collections;

import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<>();
		boolean isEmpty = q.isEmpty();
		System.out.println("Is Queue Empty : "+isEmpty);
		System.out.println("q.peek() : "+q.peek());
		System.out.println("q.poll() : "+q.poll());
		//Add elements
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(25);
		q.add(50);
		System.out.println("Size of Queue : "+q.size());
		System.out.println("Queue Elements are : "+q);
		int head = q.remove();
		System.out.println("Removed element at the head : "+head);
		int peek = q.peek();
		System.out.println("Head Element of queue : "+q);
		q.offer(60);
		q.offer(45);
		System.out.println(q);
		System.out.println("q.element() : "+q.element());
		System.out.println("q.remove() : "+q.remove());
		System.out.println(q);

	}

}
