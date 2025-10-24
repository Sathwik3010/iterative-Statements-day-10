package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class TriangularNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int N = sc.nextInt();
        
        int n = 1;
        int triangular = 1;
        
        System.out.println("Triangular numbers up to " + N + ":");
        
        while(triangular<=N) {
        	System.out.println(triangular + " ");
        	n++;
        	triangular = n * (n + 1)/2;
        }
        sc.close();
	}

}
