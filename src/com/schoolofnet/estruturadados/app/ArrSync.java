package com.schoolofnet.estruturadados.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrSync {

	public static void main(String[] args) {
		
		// List<String> list = Collections.synchronizedList(new ArrayList<String>());
		List<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("Felipe");
		list.add("Rarkilããã");
		list.add("Rosee");
		
		/*
		synchronized (list) {
			Iterator<String> i = list.iterator();
			
			while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
		*/	
		
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {			
			System.out.println(i.next());
		}		
		
		System.exit(0);
	}

}
