package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class TriangularNumberDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	       System.out.println("Enter a number:");
	       int N = sc.nextInt();
	       
	       int n = 1;
	       int triangular = 1;
	        
	       System.out.println("Triangular numbers up to " + N + ":");
	       
	       do {
	        	triangular = n * (n + 1)/2;
	        	if (triangular <= N) {
	                System.out.print(triangular + " ");
	            }
	            n++;
	       }while(triangular<=N);
	       sc.close();
	        
	}

}
