package com.abiewska.jvm;

public class MyRunStaticAlloc implements Runnable {
	public int thread;

	@Override
	public void run() {		
		int count = 0;
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 60000) {
			MemoryEater.alloc(1);
			count++;
		}
		System.out.println("W czasie 6000 milisekund wykonano " + count
				+ " alokacji. Watek: " + Thread.currentThread());

	}
}
