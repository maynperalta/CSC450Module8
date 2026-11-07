package main;

public class Main {
// Method for thread one to count up from 0 to 20	
	public static void countUp() {
		System.out.println("Thread one: Counting up...");
		for (int i = 0; i <= 20; i++) {
			System.out.println("Count up: " + i);
		}
		System.out.println("Thread one: Counting complete.");
	}
// Method for thread two to count down from 20 to 0	
	public static void countDown() {
		System.out.println("Thread two: Counting down...");
		for (int i = 20; i >= 0; i--) {
			System.out.println("Count down: " + i);
		}
		System.out.println("Thread two: Counting complete.");
	}
// Main program
	public static void main(String[] args) {
		System.out.println("Starting program...");
// Create first thread		
		Thread threadOne = new Thread (Main::countUp);
		threadOne.start();
// Wait for first thread to finish		
		try {
			threadOne.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread one was interrupted.");
			return;
		}
// Create second thread after first thread has finished		
		Thread threadTwo = new Thread (Main::countDown);
		threadTwo.start();
// Wait for second thread to finish		
		try {
			threadTwo.join();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.err.println("Thread two was interrupted.");
			return;
		}
		System.out.println("Both threads finished.");
	}
}
