package com.qa.demo;

public class MultidiminesionalArrayDemo {

	public static void main(String[] args) {

		// Multidimensional Arrays
		int[][] ageArray = { { 25, 30, 21 }, { 56, 67, 39 }, { 8, 1, 2 } }; // new int[3][3]
		String[][] nameArray = new String[3][2];
		nameArray[1][1] = "John";
		nameArray[2][1] = "Jordan";

		// For-each loop
//		for (int[] a : ageArray) {
//			for (int b : a) {
//				System.out.println(b);
//				
//			}
//		}
		// For loop
		for (int i = 0; i<ageArray.length; i++) {
			for (int j = 0; j<ageArray[i].length; j++) {
				System.out.println(ageArray[i][j]);
			}
		}
		
	}

}
