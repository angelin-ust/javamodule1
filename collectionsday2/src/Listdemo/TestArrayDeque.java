package Listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayDeque {

	public static void main(String[] args) {
 ArrayDeque<String> queue=new ArrayDeque<>();
 
 queue.addLast("First");
 queue.addLast("Second");
 queue.add("First1");
 queue.addLast("Third");
 //queue.addFirst("First12");
 System.out.println(queue);
 System.out.println(queue.size());
 String element =queue.getFirst();
 System.out.println(element);
 System.out.println(queue.pollFirst());//getting and removing from the queue
 System.out.println(queue.peek());//get() pollee aa ee function peak()
 System.out.println(queue);
 Iterator<String> iter=queue.iterator();
 while(iter.hasNext()) {
	 System.out.println(iter.next());
		
	}
	}

}
