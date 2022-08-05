package com.Demo.Runnable;

public class ThreadPriority {
	public static void main(String[] args) throws InterruptedException {

		String[] fruits = { "Banana", "Apple", "Mango" };

		String[] Flowers = { "Lotus", "Rose", "Daffodils" };

		Thread t1 = new Thread(() -> {
			for (String s : fruits) {
				System.out.println("Fruit is : " + s+":"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}, "Fruits Thread");

		Thread t2 = new Thread(() -> {

			for (String s : Flowers) {
				System.out.println("Flower is : " + s+":"+Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}, "Flowers Thread");
		
		//we can set the priorities of threads using setPriority() method
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		
		// Priorities has been set Range 1-10, 1 means less priority and 10 means highest priority and by default new thread gets's priority as 5.
		System.out.println(t1.getName()+" Priority is:"+t1.getPriority());
		System.out.println(t2.getName()+" Priority is:"+t2.getPriority());
		
		t1.start();
		Thread.sleep(10);
		t2.start();
	}
}
