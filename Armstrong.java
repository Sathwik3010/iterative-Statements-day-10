package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int original=num;
		int sum=0;
		
		while(num>0) {
			int Digit = num%10;
			sum = sum + (Digit*Digit*Digit);
			num/=10;
		}
		
		if(sum == original) {
			System.out.println(original+ " is ArmStrong Number");
		} else {
			System.out.println(original+ " is Not ArmStrong Number");
		}
		
		sc.close();
	}

}
