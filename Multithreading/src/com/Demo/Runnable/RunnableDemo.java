package com.Demo.Runnable;

class Hi implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

class Hello implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable hi = new Hi();
		Runnable hello = new Hello();

		Thread hiThread = new Thread(hi);
		Thread helloThread = new Thread(hello);

		hiThread.start();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		helloThread.start();
	}
}
