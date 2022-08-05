package com.Demo.Runnable;

public class LambdaDemo {
	public static void main(String[] args) {

		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hi");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}).start();
		new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
			}
		}).start();
	}
}
