package com.schoolofnet.estruturadados.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.schoolofnet.app.utils.Person;

public class CompSortImpl {

	public static void main(String[] args) {
		List<Person> arr = new ArrayList<>();
		
		arr.add(new Person("Thiagão", 28));
		arr.add(new Person("Rarkilããã", 24));
		arr.add(new Person("Rosee", 57));
		arr.add(new Person("Felipão", 31));
		
		for(Person p : arr) {
			System.out.println(p.getNome()+" "+p.getAge());
		}
		
		System.out.println();
		
		 Collections.sort((List) arr);
		// Collections.sort((List) arr, new Person());
		
		for(Person p : arr) {
			System.out.println(p.getNome()+" "+p.getAge());
		}
		
		System.exit(0);
	}

}
