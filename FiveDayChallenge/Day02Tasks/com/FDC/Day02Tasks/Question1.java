package com.FDC.Day02Tasks;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word to Check Palindrome or not: ");
		String word = sc.nextLine().toLowerCase();
		int n = word.length();
		boolean isPalindrome = true;
		
		for(int i = 0; i < n/2 ; i++) {
			if(word.charAt(i) != word.charAt(n-1-i)) {
				isPalindrome = false;
				break;
			}
		}
		
		if(isPalindrome) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();

	}

}
