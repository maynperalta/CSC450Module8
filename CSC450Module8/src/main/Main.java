package main;

public class Main {
	
	public static void countUp() {
		System.out.println("Thread one: Counting up...");
		for (int i = 0; i <= 20; i++) {
			System.out.println("Count up: " + i);
		}
		System.out.println("Thread one: Counting complete.");
	}
	public static void countDown() {
		System.out.println("Thread two: Counting down...");
		for (int i = 20; i >= 0; i--) {
			System.out.println("Count down: " + i);
		}
		System.out.println("Thread two: Counting complete.");
	}

	public static void main(String[] args) {
		System.out.println("Hewwo World!");

	}

}
