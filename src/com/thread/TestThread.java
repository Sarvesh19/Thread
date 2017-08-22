package com.thread;

class FooRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("FooRunnable Runnable running " + x);
		}
	}
}

class BooRunnable implements Runnable {
	public void run() {
		for (int x = 1; x < 6; x++) {
			System.out.println("BooRunnable Runnable running " + x);
		}
	}
}

public class TestThread {
	public static void main(String[] args) {
		FooRunnable r = new FooRunnable();
		BooRunnable b = new BooRunnable();
		Thread t = new Thread(r);
		Thread t1 = new Thread(b);
		t.start();
		t1.start();
	}
}
