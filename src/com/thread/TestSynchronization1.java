package com.thread;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

class Table {
	int count = 0;

	public void getFile(List<Integer> num) {
		try {
			PrintWriter writer = null;
			// if (count == 0) {
			writer = new PrintWriter(new FileOutputStream("output.txt", true));
			// count++;
			// }

			writer.println(num);
//			System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("console.txt")), true));

			writer.close();
			writer.flush();
		} catch (IOException e) {
			// do something
		}
	}

	 synchronized void printTable(int n) {// method not synchronized
		List<Integer> integers = new ArrayList<Integer>();
		for (Integer i = 1; i <= 5; i++) {
			System.out.println(n * i);
			integers.add((n * i));

			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		getFile(integers);

	}
}

class MyThread1 extends Thread {
	Table t;

	MyThread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	Table t;

	MyThread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization1 {
	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();

	}
}