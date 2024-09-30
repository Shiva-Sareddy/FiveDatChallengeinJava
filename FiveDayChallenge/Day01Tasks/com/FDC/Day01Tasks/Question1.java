package com.FDC.Day01Tasks;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Temperature in Fahrenheit: ");
		double f = sc.nextDouble();
		double formula = ((f-32) * 5) / 9;
		System.out.println("The Fahrenheit to Celcius is: " + formula + " C");
		sc.close();

	}

}
