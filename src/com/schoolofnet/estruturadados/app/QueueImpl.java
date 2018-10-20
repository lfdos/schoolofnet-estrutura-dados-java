package com.schoolofnet.estruturadados.app;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {

	public static void main(String[] args) {
		Queue queue = new LinkedList<>();
		
		System.out.println("Push: "+queue.add("a"));
		System.out.println("Push: "+queue.add("b"));
		System.out.println("Push: "+queue.add("c"));
		System.out.println();
		
		System.out.println("Element: "+queue.element());
		System.out.println();
		
		System.out.println("Remove: "+queue.remove());
		System.out.println("Element: "+queue.element());
		
		System.out.println("Poll: "+queue.poll());
		System.out.println("Element: "+queue.element());
		
		System.out.println("Peek: "+queue.peek());
		
		System.exit(0);
	}

}
