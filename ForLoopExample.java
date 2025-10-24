package com.codegnan.IterativeStatements;

public class ForLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for(System.out.println("Hi");i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

} 

