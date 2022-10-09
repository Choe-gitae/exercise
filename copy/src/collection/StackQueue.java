package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {

		// 1. 스택	LIFO
		Stack<String> s = new Stack<String>();
		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s.pop());
		
		// 2. 큐		FIFO
		Queue<String> q = new LinkedList<String>();
		q.offer("A");
		q.offer("B");
		q.offer("C");
		System.out.println(q.poll());
		
	}

}
