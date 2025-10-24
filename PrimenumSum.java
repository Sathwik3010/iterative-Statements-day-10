package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class PrimenumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		System.out.println("Prime numbers upto "+n);
		for(int i = 2;i<=n;i++) {
			boolean isPrime = true;
			for(int j = 2;j<=i/2;j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i+ " ");
			}
		}
		sc.close();
	}

}
