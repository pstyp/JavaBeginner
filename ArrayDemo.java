package com.qa.demo;

public class ArrayDemo {

	public static void main(String[] args) {
		
		
		// Arrays
		int[] ageArray = {18, 26, 0, 100, 12, 16, 15, 1, 2};
		long[] ageArray2 = new long[6];
		String[] nameArray = {"John", "Emma", "Alex", "Rachel", "Sean"};

		ageArray2[0]=3;
		ageArray2[1]=5;
		ageArray2[2]=6;
		ageArray2[3]=8;
		// For loop
//		for (int i = 0; i<ageArray2.length; i++) {
//			System.out.println(ageArray2[i]);
//		}
		// For-each loop (enhanced for loop)
		
//		for (int age : ageArray) {
//			System.out.println(age);
//		}
		for (String name : nameArray) {
			System.out.println(nameArray[0]);
		}
		
		
	}
	

}
