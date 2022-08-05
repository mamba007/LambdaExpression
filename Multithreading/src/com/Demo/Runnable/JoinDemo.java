package com.Demo.Runnable;

public class JoinDemo {
	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {

			for (int i = 1; i <= 3; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(() -> {

			for (int i = 1; i <= 3; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		t1.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("Bye");

	}
}
