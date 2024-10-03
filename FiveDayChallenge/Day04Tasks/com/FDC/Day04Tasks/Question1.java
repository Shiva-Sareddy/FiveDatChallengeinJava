package com.FDC.Day04Tasks;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // for classes (rows)
		int n = sc.nextInt(); // for students (columns)
		int[][] classroom = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.println("Enter Age: " + i + " Student " + j);
				classroom[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(classroom[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
