package com.FDC.Day01Tasks;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		if(age >= 18) {
			System.out.println("Eligible to Vote");
		}else if(age >= 0 && age < 18) {
			System.out.println("Not eligible to Vote");
		}else {
			System.out.println("Enter invalid age");
		}
		sc.close();
	}

}
