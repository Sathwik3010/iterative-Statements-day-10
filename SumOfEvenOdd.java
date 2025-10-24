package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenSum=0;
		int oddSum=0;
		for(int i=1 ;i<=num;i++) {
			if(i%2 == 0) {
				evenSum+=i;
			} else {
				oddSum+=i;
			}
		}
		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);

		sc.close();
	}

}
