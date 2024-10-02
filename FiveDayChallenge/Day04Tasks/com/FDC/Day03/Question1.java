package com.FDC.Day03;

import java.util.Scanner;

public class Question1 {
	
	public void ArmStrong(Long n) {
		String converted = String.valueOf(n);
		int len = converted.length();
		int sum = 0;
		for(int i = 0; i < len; i++) {
			int digit = Character.getNumericValue(converted.charAt(i));
			sum = (int) (sum + Math.pow(digit, len));
		}
		if (sum == n) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an Armstrong Number");
		}
		
	}
	public static void main(String[] args) {
		Question1 q1 = new Question1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  to check ArmStrong or not: ");
		q1.ArmStrong(sc.nextLong());
		sc.close();

	}

}
