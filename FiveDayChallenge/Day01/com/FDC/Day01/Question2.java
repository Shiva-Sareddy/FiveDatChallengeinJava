package com.FDC.Day01;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive Integer: ");
		int n = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= n; i++) {
			 count = count + Integer.toString(i).length();
		}
		System.out.println("Output: " + count);
		sc.close();
	}

}
