package com.FDC.Day02Tasks;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		int product = 1;
		for(int i = 1; i <= n; i++) {
			product = product * i;
		}
		System.out.println("The Factorial of " + n + " is: " + product);
		sc.close();

	}

}
