package com.abiewska.jvm;

import java.util.Random;

public class MyRunDynamicAlloc  implements Runnable{
  public int thread;
	
	@Override
	public void run() {
		int count = 0;
		Random rand = new Random();
		long start = System.currentTimeMillis();
		while (System.currentTimeMillis() - start < 60000) {
				MemoryEater.alloc(rand.nextInt(10));
				count++;
		}
		System.out.println("W czasie 6000 milisekund wykonano " + count + " alokacji. Watek: "
				+ Thread.currentThread());			
	}
}
