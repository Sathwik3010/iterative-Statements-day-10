package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of days:");
		int n=sc.nextInt();
		
		int price[] = new int[n];
		System.out.println("Enter the stock of price");
		 	for(int i=0;i<n;i++) {
		 		 price[i] = sc.nextInt();
		 	}
		 	
		 	int longest=1;
		 	int current=1;
		 	
		 	for(int i=1;i<n;i++) {
		 		if(price[i]>price[i-1]) {
		 			current++;
		 			if(current>longest) {
		 				longest=current;
		 			}
		 		} else {
		 			current = 1;
		 		}
		 	}
		 	System.out.println(longest);
		sc.close();
	}

}
