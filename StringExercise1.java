package com.qa.demo;

public class StringExercise1 {

	public static void main(String[] args) {

		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		System.out.println(str2.toUpperCase() + ", " + str1.toUpperCase());

		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);
	}
}
