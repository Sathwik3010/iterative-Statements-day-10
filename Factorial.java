package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int fact=1; 
		for(;i>=1;i--) {
			fact*=i;
		}
		System.out.println(fact);

		sc.close();
	}

}