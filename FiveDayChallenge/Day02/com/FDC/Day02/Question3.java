package com.FDC.Day02;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length: ");
		int length = sc.nextInt();
		System.out.print("Enter Breadth: ");
		int breadth = sc.nextInt();
		String res = (length == breadth) ? "Square" : "Rectangle";
		System.out.println(res);
		sc.close();

	}

}
