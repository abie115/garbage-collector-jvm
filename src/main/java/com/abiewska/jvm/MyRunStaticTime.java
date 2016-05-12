package com.abiewska.jvm;

public class MyRunStaticTime implements Runnable {
	public int thread;

	@Override
	public void run() {	
		int count = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			MemoryEater.alloc(1);
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("Wykonano " + count + " alokacji w czasie: "
				+ (end - start) + ". Watek: "
				+ Thread.currentThread());
	}
}
