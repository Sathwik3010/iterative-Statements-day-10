package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int first=0 , second = 1;
		
		System.out.println("Fibonacci Series");
		for(int i=1;i<=num;i++) {
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		sc.close();
	}

}
