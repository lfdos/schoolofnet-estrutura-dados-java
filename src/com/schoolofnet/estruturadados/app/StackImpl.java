package com.schoolofnet.estruturadados.app;

import java.util.Random;
import java.util.Stack;

import com.schoolofnet.app.utils.TestinhoObject;

public class StackImpl {
	
	public static void main(String[] args) {
		Stack stack = new Stack<>();
		Stack stck = new Stack<>();
		Random random = new Random();
		TestinhoObject t = new TestinhoObject("Felipe", "Felipão");
		int i = 5;
		
		/*
		while (i != 0) {
			System.out.println("Push: "+stack.push(random.nextInt(20)));
			i--;
		}
		System.out.println();
		for (int j = 0; j < 5; j++) {
			System.out.println("Pop: "+stack.pop());			
		}
		*/
		
		for (int j = 0; j < 3; j++) {
			System.out.println("Push: " + stck.push(new TestinhoObject("Nome "+j+1, "Apelido "+j+1).toString()));
		}
		System.out.println();
		while(!stck.isEmpty()) {
		//for (int j = 0; j < 3; j++) {
			System.out.println("Pop: " + stck.pop());
		}
		
		System.exit(0);
	}

}


