package com.qa.demo;

public class IterationDemo {

	public static void main(String[] args) {
		forLoop();
	}

	// WHILE LOOP
	public static void catPrinter() {
		int catCount = 5;
		boolean notEnoughCats = true;

		while (notEnoughCats) {
			System.out.println(catCount + ": Another cat");
			catCount++;
			if (catCount == 50) {
				notEnoughCats = false;
			}
		}
		System.out.println("Too many cats");
	}

	// DO WHILE LOOP
	public static void doWhile() {
		int playCount = 0;
		boolean playing = false;
		do {
			System.out.println(playCount + ": playing");
			playCount++;
			
			if (playCount==7) {
				playing=false;
			}
			
		} while (playing);
		System.out.println("Game Over!");
	}
	
	// FOR LOOP
	public static void forLoop() {
		for (int i = 0; i<100; i++) {
			System.out.println(i);
		}
	}

}
