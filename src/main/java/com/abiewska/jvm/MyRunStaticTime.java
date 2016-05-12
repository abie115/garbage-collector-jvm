package com.abiewska.jvm;

public class MyRunStaticTime implements Runnable {
	public int thread;

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int count = 0;
		for (int i = 0; i < 500; i++) {
			MemoryEater.alloc(32);
			count++;
		}
		System.out.println("Wykonano " + count + " alokacji w czasie: "
				+ (System.currentTimeMillis() - start) + ". Watek: "
				+ Thread.currentThread());

	}
}
