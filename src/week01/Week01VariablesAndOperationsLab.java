//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int availablePlaneSeats = 138;
		
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 59.83;
		
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'T';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = true;
		
		// 5. Create a variable to hold a customer's first name
		String firstName = "Mike"; 
		
		// 6. Create a variable to hold a street address
		String streetAddress = "1260 State Route 97 East";

		// 7. Print all variables to the console
		System.out.println("The number of available seats is: " + availablePlaneSeats);
		System.out.println("Your total cost for groceries is: $" + costOfGroceries);
		System.out.println("Your middle initial is: " + middleInitial);
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("Your first name is: " + firstName);
		System.out.println("Your street address is: " + streetAddress);

		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats-2;
		System.out.println("The number of available seats is now " + availablePlaneSeats);
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;
		costOfGroceries = costOfGroceries+2.15;
		System.out.println("Your total cost of groceries is now: $" + costOfGroceries);
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = 'S';
		System.out.println("Your middle initial is: " + middleInitial);
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = false;
		System.out.println("It is hot outside: " + isHotOutside);
		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String lastName = "Smith";
		String fullName = firstName + " " + middleInitial + ". " + lastName;
		System.out.println("Your full name is: " + fullName);
		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("The Customer's full name is " + fullName + " " + "and they live at " + streetAddress);
		
		
	}
}