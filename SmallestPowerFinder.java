package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class SmallestPowerFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers (N and K):");
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int i=1;
		int power = K;
		while(power <N) {
			i++;
			power=(int) Math.pow(K, i);
		}
		System.out.println(i);
		sc.close();
	}

}
