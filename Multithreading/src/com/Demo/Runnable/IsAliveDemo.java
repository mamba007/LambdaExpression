package com.Demo.Runnable;

public class IsAliveDemo {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(() -> {

			for (int i = 1; i < 3; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		Thread t2 = new Thread(() -> {
			for (int i = 1; i < 3; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});

		t1.start();
		Thread.sleep(10);
		t2.start();
		//isAlive() will check whether your thread is in running state, here we are checking before performing join(), so it will be true
		
		System.out.println("Before Joining to the main thread : "+t1.isAlive()); 
		
		t1.join(); // method will make main thread to wait for t1 and t2 to join again
		t2.join(); // join() method will make main thread to wait for t1 and t2 to join again
		
		//it will be false
		System.out.println("After Joining to the main thread : "+t1.isAlive());
		System.out.println("Bye");
	}

}
