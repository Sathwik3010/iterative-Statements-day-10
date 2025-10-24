package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers ");
		int n=sc.nextInt();
		int sum=0;
		
		System.out.println("The prime numbers upto "+n);
		for(int i=2;i<=n;i++) {
			boolean isPrime = true;
			for(int j=2;j<=i/2;j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				System.out.println(i+" ");
				sum+=i;
			}
		}
		System.out.println("Sum of prime numbers up to "+n+ " is "+sum);
	}

}
