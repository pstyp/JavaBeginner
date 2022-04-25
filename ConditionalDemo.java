package com.qa.demo;

public class ConditionalDemo {

	
	public static void main(String[] args) {
		
	conditionalExample(7, false);
	}
	
	// IF IT'S SUNNY TOMORROW, I'll GO OUT. ELSE, I'LL STAY HOME.
	public static void canPawelJava(boolean canPawelJava) {

		
		if (canPawelJava) {
			System.out.println("Pawel can Java");
		} else {
			System.out.println("Pawel can't Java");
		}
	}
	
	public static void numbersJava(int number) {
	
		
		if (number <= 20) {
			System.out.println("Number is less than or equal to 20");
		} else if (number < 40) {
			System.out.println("Number is between 20 and 40");
		} else {
			System.out.println("Number is greater than or equal to 40");
		}
	}
	
	public static void switchCase() {
		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 3:
			System.out.println("Case 3");
			break;
		case 4:
			System.out.println("Case 4");
			break;
		default:
			System.out.println("This is the default option");
			break;
		}
	}
	
	// IF PARAMETER NUM IS GREATER THAN 5 AND PARAMETER BOOL IS SET TO TRUE, PRINT HELLO. (ELSE)IF NUM IS GREATER THAN 6,
	// PRINT PARAMETER NUM
	//ELSE PRINT BYE 
	public static void conditionalExample(int num, boolean bool) {
		if (num>5 && bool) {
			System.out.println("Hello");
		} else if (num>6) {
			System.out.println(num);
		}
		else {
			System.out.println("Bye");
		}
	}
	
}
