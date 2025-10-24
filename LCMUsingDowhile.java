package com.codegnan.IterativeStatements;

import java.util.Scanner;

public class LCMUsingDowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers (A and B):");

		int A = sc.nextInt();
		int B = sc.nextInt();

		int lcm = (A>B)?A:B;
		
		do {
			if(lcm%A==0 && lcm%B==0) {
				break;
			}
			lcm++;
		}while(true);
		
		System.out.println("LCM of "+A+ " & "+B+" is: "+lcm);
	}

}
