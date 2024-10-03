package com.FDC.Day04;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println("+" + "-".repeat(n) + "+");
		for(int i = 1; i <= m; i++) {
			for(int j = 1; j <= n; j++) {
				if(j==1 || j == n) {
					System.out.print("|  ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("+" + "-".repeat(n) + "+");
		sc.close();

	}

}
