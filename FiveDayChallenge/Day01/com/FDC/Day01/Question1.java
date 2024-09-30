package com.FDC.Day01;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Data type: ");
		String dataType = sc.nextLine();
		if(dataType.equalsIgnoreCase("byte")) {
			System.out.println("The size of byte is: " + Byte.BYTES);
		} else if (dataType.equalsIgnoreCase("short")) {
			System.out.println("The size of short is: " + Short.BYTES);
		} else if (dataType.equalsIgnoreCase("int")) {
			System.out.println("The size of int is: " + Integer.BYTES);
		} else if (dataType.equalsIgnoreCase("long")) {
			System.out.println("The size of long is: " + Long.BYTES);
		} else if (dataType.equalsIgnoreCase("float")) {
			System.out.println("The size of float is: " + Float.BYTES);
		} else if (dataType.equalsIgnoreCase("double")) {
			System.out.println("The size of double is: " + Double.BYTES);
		} else if (dataType.equalsIgnoreCase("char")) {
			System.out.println("The size of short is: " + Character.BYTES);
		} else {
			System.out.println("Invalid");
		}
		sc.close();
	}
}
