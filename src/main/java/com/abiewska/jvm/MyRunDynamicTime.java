package com.abiewska.jvm;

import java.util.Random;

public class MyRunDynamicTime implements Runnable {
	public int thread;

	@Override
	public void run() {		
		int count = 0;
		Random rand = new Random();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 500; i++) {
			MemoryEater.alloc(rand.nextInt(10));
			count++;
		}
		long end = System.currentTimeMillis();
		System.out.println("Wykonano " + count + " alokacji w czasie: "
				+ (end - start) + ". Watek: "
				+ Thread.currentThread());
	}
}
