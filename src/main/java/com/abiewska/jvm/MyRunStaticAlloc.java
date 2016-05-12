package com.abiewska.jvm;

public class MyRunStaticAlloc implements Runnable {
	public int thread;

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int count = 0;
		while (System.currentTimeMillis() - start < 60000) {
			MemoryEater.alloc(32);
			count++;
		}
		System.out.println("W czasie 6000 milisekund wykonano " + count
				+ " alokacji. Watek: " + Thread.currentThread());

	}
}
