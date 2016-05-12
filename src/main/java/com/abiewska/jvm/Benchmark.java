package com.abiewska.jvm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Benchmark {
	private static final Integer multiThread = 4;
	private static final Integer oneThread = 1;

	
	//jeden watek liczba alokacji w okreslonym czasie
	public static void oneThreadStaticSizeAlloc() {
		for (int i = 0; i < oneThread; i++) {
			MyRunStaticAlloc alloc = new MyRunStaticAlloc();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}
	
	//jeden watek czas okreslonej liczby alokacji
	public static void oneThreadStaticSizeTime() {
		for (int i = 0; i < oneThread; i++) {
			MyRunStaticTime alloc = new MyRunStaticTime();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}

	public static void oneThreadDynamicSizeAlloc() {
		for (int i = 0; i < oneThread; i++) {
			MyRunDynamicAlloc alloc = new MyRunDynamicAlloc();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}
	
	public static void oneThreadDynamicSizeTime() {
		for (int i = 0; i < oneThread; i++) {
			MyRunDynamicTime alloc = new MyRunDynamicTime();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}

	public static void multiThreadStaticSizeAlloc() {
		for (int i = 0; i < multiThread; i++) {
			MyRunStaticAlloc alloc = new MyRunStaticAlloc();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}
	
	public static void multiThreadStaticSizeTime() {
		for (int i = 0; i < multiThread; i++) {
			MyRunStaticTime alloc = new MyRunStaticTime();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}

	public static void multiThreadDynamicSizeAlloc() {
		for (int i = 0; i < multiThread; i++) {
			MyRunDynamicAlloc alloc = new MyRunDynamicAlloc();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}

	public static void multiThreadDynamicSizeTime() {
		for (int i = 0; i < multiThread; i++) {
			MyRunDynamicTime alloc = new MyRunDynamicTime();
			alloc.thread = i + 1;
			new Thread(alloc).start();
		}
	}
}
