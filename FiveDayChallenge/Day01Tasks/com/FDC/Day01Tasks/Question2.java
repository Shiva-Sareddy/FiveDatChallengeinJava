package com.FDC.Day01Tasks;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int n = sc.nextInt();
		System.out.print("The numbers from 1 to " + n + " are: ");
		for(int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		sc.close();
	}

}
