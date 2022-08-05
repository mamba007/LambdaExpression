package com.Demo.Runnable;

// synchronized is keyword which allows only one thread at a time to execute a increment() method

class Value {
	int counter;

	public synchronized void increment() {
		counter++;
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) throws InterruptedException {

		Value v = new Value();

		Thread t1 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				v.increment();
			}
		}, "Thread A");

		Thread t2 = new Thread(() -> {
			for (int i = 1; i <= 1000; i++) {
				v.increment();
			}
		}, "Thread B");

		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println("Count is: " + v.counter);

	}

}
