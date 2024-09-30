package com.FDC.Day01;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		int counter = 10;
		while(counter > 0) {
			System.out.print(counter * n + " ");
			counter--;
		}
		System.out.println();
		sc.close();

	}

}
