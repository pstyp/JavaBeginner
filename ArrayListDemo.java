package com.qa.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Zayn");
		names.add("Jammy James");
		names.add("Rowan");
		names.add("Duckee");
		names.add("Angelica");
		names.add("Pawel");
		
//		System.out.println(names);
//		System.out.println(names.get(4));
//		names.set(1, "Aswene");
//		System.out.println(names);
		
//		System.out.println(names.size());
//		
//		// Enhanced for loop
//		for (String name :names) {
//			System.out.println(name);
//		}
		// Regular for loop
//		for (int i=3; i<names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		// Collections
		Collections.swap(names, 0, 5);
		System.out.println(names);
		Collections.reverse(names);
		System.out.println(names);
		Collections.sort(names);
		System.out.println(names);
		
		names.clear();
		System.out.println(names);
		
		List<String> names2 = new ArrayList<>(List.of("James", "George", "Bob"));
		System.out.println(names2);
	}

}
