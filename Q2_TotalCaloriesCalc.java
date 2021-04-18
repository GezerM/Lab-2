package lab2;

import java.util.Scanner;

public class Q2_TotalCaloriesCalc {

		/*
		 * Question-2
		 * 
		 * A bag of cookies holds 40 cookies. The calorie information on the bag claims
		 * that there are 10 serving in the bag and that a serving equals 300 calories.
		 * write a program that lets the user enter the number of cookies he or she
		 * actually ate and then reports the number of total calories consumed.
		 */
	    public static void main(String[] args) {
	        
	        double calPerCookie = 300 / 4;
	        int numCookies;
	        double calConcummed;
	        System.out.println("EACH cookie you eat is " + calPerCookie+" calories");
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please enter how many cookies you ate: ");
	        numCookies = sc.nextInt();
	        if (numCookies >=0 ) {
	            calConcummed = calPerCookie * numCookies;
	        System.out.println("Total amount of calories gained is " + calConcummed + " calories");
	        } else {
	            System.out.println("An invalid number, please run again!");
	        }
	            
	       }
}
