package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class SingleDigitReducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num ex 1234 it gives output 10 and sum of 10 is 1");
		int number=sc.nextInt();
		
		while(number>=10) {// if number has more than 1 single digit
			int digitSum=0;// variables to store the sum of digits for this round
			while(number>0) {// extract and sum all digits of the current number
				int lastDigit=number%10;
				digitSum+=lastDigit;
				number/= 10;
				
			}
			//after summing all digits, set number's to the new Sum.
			// and repeat if it still has morethan one digit.
			number= digitSum;
//			System.out.println(digitSum);

		}
		// when the number becomes a single digit print the result
		System.out.println(number);
		sc.close();
	}

}
