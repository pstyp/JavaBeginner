package com.qa.demo;

public class StringMethodsExercise {

	public static void main(String[] args) {
		method1("this is a string");
		method2("this is a string");
		method3("this is a string");
		method4("hello there", "there");

	}

	public static void method1(String input) {

		int space = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.substring(i, i + 1).equals(" ") || i == (input.length() - 1)) {
				space++;
			}

		}

		System.out.println("What's the word count? " + space);

	}

	public static void method2(String input) {

		int space = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.substring(i, i + 1).equals(" ") || i == (input.length() - 1)) {
				System.out.println(input.substring(space, i + 1));
				space = i + 1;
			}

		}
	}

	public static void method3(String input) {

		int space = input.length();

		for (int i = input.length(); i > 0; i--) {

			if (input.substring(i - 1, i).equals(" ")) {
				System.out.println(input.substring(i, space));
				space = i;
			} else if (i == 1) {
				System.out.println(input.substring(i - 1, space));
			}

		}

	}

	public static boolean method4(String message, String find) {

		boolean myBool = false;
		int range = message.length()-find.length();

		for (int j = 0; j < range; j++) {

			if (message.substring(j+1, j + find.length()+1).equals(find) ||
					message.substring(j, j + find.length()).equals(find)) {
				myBool = true;
			}

		}

		System.out.println("Substring present? " + myBool);
		return myBool;

	}

}
