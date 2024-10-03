package com.FDC.Day04Tasks;

import java.util.Scanner;

public class Question2 {
	
	void SquarePattern(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				if(i==1 || j == 1 || i == n || j == n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Question2 q2 = new Question2();
		System.out.print("Enter the Number: ");
		q2.SquarePattern(sc.nextInt());
		sc.close();

	}

}
