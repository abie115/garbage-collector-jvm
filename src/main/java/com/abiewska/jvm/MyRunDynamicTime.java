package com.abiewska.jvm;

import java.util.Random;

public class MyRunDynamicTime implements Runnable {
	public int thread;

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		int count = 0;
		Random rand = new Random();
		for (int i = 0; i < 500; i++) {
			MemoryEater.alloc(rand.nextInt(64));
			count++;
		}
		System.out.println("Wykonano " + count + " alokacji w czasie: "
				+ (System.currentTimeMillis() - start) + ". Watek: "
				+ Thread.currentThread());
	}
}
