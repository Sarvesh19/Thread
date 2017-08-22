package com.thread;

class Pen {
}

class Paper {
}

public class WriteLock {

	public static void main(String[] args) {
		final Pen pn = new Pen();
		final Paper pr = new Paper();

		Thread t1 = new Thread() {
			public void run() {
				synchronized (pn) {
					System.out.println("Thread1 is holding Pen");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}

					
				}
				synchronized (pr) {
					System.out.println("Requesting for Paper");
				}

				// In this scenario When This two thread start t1 and t2 It call
				// t1's run() and t2's run()
				// Now, Synchronized means it will lock in moniter until that
				// object finishes
				// So In this case both pn and pr are locked SO now after this
				// for pn it can't access pr becaause there is lock by other
				// thread t2
				// So in this case if we move pn's pr block out then it will
				// work because we are releasing the lock No in this case When t1 t2 runs t1 run sync pn and pr because no lock

			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (pr) {
					System.out.println("Thread2 is holding Paper");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
					synchronized (pn) {
						System.out.println("requesting for Pen");
					}

				}
			}
		};

		t1.start();
		t2.start();
	}

}