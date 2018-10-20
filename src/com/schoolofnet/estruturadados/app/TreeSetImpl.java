package com.schoolofnet.estruturadados.app;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		TreeSet tree = new TreeSet();
		// TreeSet<Integer> tree = new TreeSet<Integer>();
		
		/*
		tree.add("Felipão");
		tree.add("Rarkilããã");
		tree.add("Rosee");
		*/
		
		tree.add(5);
		tree.add(2);
		// tree.add("Testinho");
		tree.add(7);
		tree.add(20);
		tree.add(10);
		
		// System.out.println(tree);
		
		Iterator i = tree.iterator();
		
		while (i.hasNext()) {
			System.out.print(i.next()+", ");			
		}
		System.out.println();
		System.out.println(tree.first());
		System.out.println(tree.last());
		
		System.out.println();
		System.out.println(tree.pollFirst());
		System.out.println(tree.pollLast());
		
		System.out.println();
		
		i = tree.iterator();
		while (i.hasNext()) {
			System.out.print(i.next()+", ");			
		}
		
		System.exit(0);
	}

}
