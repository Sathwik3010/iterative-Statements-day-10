package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class PalindromCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=n;i++) {
		  
		  int original = i;
		  int num = i;
		  int reverse=0;
		  
			while(num>0) {
				int digit=num%10;
				reverse=(reverse * 10)+digit;
				num/=10;
			}
			
			if(original == reverse) {
				count++;
				System.out.println("Palindrom numbers "+original);
			} 
			
		}
		System.out.println("Total: "+count);
		
		sc.close();
	}

}
