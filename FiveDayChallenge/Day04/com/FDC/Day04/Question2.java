package com.FDC.Day04;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int[] diagonal = new int[Math.min(m, n)];
		for(int i = 0; i < Math.min(m, n); i++) {
			diagonal[i] = arr[i][i];
		}
		System.out.println(Arrays.toString(diagonal));
		sc.close();

	}

}
