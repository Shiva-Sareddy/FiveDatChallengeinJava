package com.FDC.Day02;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number: ");
		int a = sc.nextInt();
		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Third Number: ");
		int c = sc.nextInt();
		
		System.out.print("The Greatest Number is: ");
		
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else if(b > a) {
			if(b > c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}else {
			System.out.println(a);
		}
		sc.close();
	}

}
