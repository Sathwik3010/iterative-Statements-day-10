package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class CollatzSequenceLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		
		int count = 1;
		
		while(n!=1) {
			if(n%2==0) {
				n/=2;
			} else {
				n=3*n+1;
			}
			
			count++;
		}
		System.out.println(count);
		sc.close();
	}

}
