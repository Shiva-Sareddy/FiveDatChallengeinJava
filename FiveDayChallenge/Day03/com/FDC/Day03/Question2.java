package com.FDC.Day03;

import java.util.Scanner;

public class Question2 {
	
	public void AsciiConversion(int m, int n) {
		char converted1 = (char) m;
		char converted2 = (char) n;
		System.out.println(converted1 + "" + converted2);
	}
	public static void main(String[] args) {
		Question2 q2 = new Question2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		q2.AsciiConversion(sc.nextInt(), sc.nextInt());
		sc.close();
	}

}
