package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int reverse = 0;
		while(num>0) {
			int lastDigit = num%10;
		    reverse = (reverse * 10) + lastDigit;
			num/=10;
		}
		System.out.println("Reversed Number: "+reverse);
		sc.close();
	}

}
