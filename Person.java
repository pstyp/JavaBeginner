package com.qa.demo;

public class Person {

	// ATTRIBUTES
	private String name;
	private int age;
	private double shoesize;

	

//	// Constructor
	public Person(String name, int age, double shoesize) {
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
	}
	// OVERLOADING

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// NOT-STATIC METHOD
	public void greet() {
		System.out.println("Hi I'm " + name + " and I'm " + age + " years old.");
	}
	
	// STATIC METHOD
	public static void hello() {
		System.out.println("hello");
	}
}
