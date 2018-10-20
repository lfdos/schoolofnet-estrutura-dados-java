package com.schoolofnet.app.utils;

import java.util.Comparator;

public class Person implements Comparator<Person>, Comparable<Person>{

	private String nome;
	private Integer age;
	
	public Person() {}
	
	public Person(String nome, Integer age) {
		this.nome = nome;
		this.age = age;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compare(Person p1, Person p2) {		
		return p1.getAge() - p2.getAge();
	}

	@Override
	public int compareTo(Person p) {
		return this.nome.compareTo(p.getNome());
	}
	
	/*
	@Override
	public int compareTo(Person p) {
		return this.age.compareTo(p.getAge());
	}
	*/	

}
