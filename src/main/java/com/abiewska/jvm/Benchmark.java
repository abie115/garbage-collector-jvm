package com.abiewska.jvm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Benchmark {

	public class MyRun implements Runnable {

		public void run() {
			long start = System.currentTimeMillis();
			int count = 0;
			while (System.currentTimeMillis() - start < 30000) {
				int[] arr = new int[100];
				count++;
			}
			System.out.println("Wielkosc alokacji: " + count + " bajt."+" Watek: "
					+ Thread.currentThread());
		}

	}

	public Benchmark(int number) {
		ExecutorService executorService;
		switch (number) {
		case 1:
			executorService = Executors.newFixedThreadPool(1);
			executorService.execute(new MyRun());
			executorService.shutdown();
			break;

		case 2:
			executorService = Executors.newFixedThreadPool(4);
			for (int i = 0; i < 4; i++) {
				executorService.execute(new MyRun());
			}
			executorService.shutdown();
			break;
		}
	}
}
