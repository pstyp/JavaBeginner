package com.qa.demo;

public class Runner {

	public static void main(String[] args) {
		
	Person john = new Person("John", 20, 9.5);
	Person amy = new Person("Amy", 90);
	
	john.greet();
	amy.greet();
	
	Person.hello();
	
	IterationDemo.catPrinter();
	IterationDemo.doWhile(); 
	}

}
