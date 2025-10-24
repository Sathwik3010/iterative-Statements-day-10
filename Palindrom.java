package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
        int original = num;   // store the original number
		int reverse=0;
		while(num>0) {
			int lastDigit=num%10;
			reverse = (reverse * 10)+lastDigit;
			num/=10;
		}
		
		if(original == reverse) {
            System.out.println("Palindrome");
		} else {
            System.out.println("Not a Palindrome");
		}
	}

}
