package lab2;

import java.util.Scanner;

public class Q3_SumOfIntegers {

	public static void main(String[] args) {
		/*
		 * Question-3
		 * 
		 * Write a program that asks the user for a positive nonzero integer value. The
		 * program should use a loop to get the sum of all the integers from 1 up to the
		 * number entered.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Sum up 1 to Your Number Calculator");
		System.out.println("Enter a POSITIVE number : ");
		int num = scan.nextInt();
		int sum = 0;

		while (num != -1) {
			if (num <= 0) {
				System.out.println("Invalid number. Try again: ");
				num = scan.nextInt();
				continue;
			}

			for (int i = 1; i <= num; i++) {
				sum += i;
			}
			System.out.println("Sum of 1 to " + num + " is: " + sum);

			System.out.println("Enter a new number or Enter -1 to Exit: ");
			num = scan.nextInt();
			sum = 0;

		}

		System.out.println("Thanks for using. ");

	}

}