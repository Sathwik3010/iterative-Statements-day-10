package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt(); // enters a number
		int count=0;
		
		while(num>0) { // if the num satisfies the condition enters into the loop
			num/=10;   // it divides with the num and gives the quotient as the new number for next iteration
			count++;   // for every iteration means for every time we remove the last digit the count increase (add 1)
		}
		System.out.println(count);
		sc.close();
	}

}