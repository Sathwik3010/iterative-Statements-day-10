package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int sum=0;

		while(num>0) {// the input should satisfy the condition
			int lastDigit=num%10; // gives the last digit as reminder 
			sum+=lastDigit;// sum the last digit of the number 
			num/=10;// remove the last digit for the next Iteration
		}
		System.out.println(sum);
		sc.close();
	}

}