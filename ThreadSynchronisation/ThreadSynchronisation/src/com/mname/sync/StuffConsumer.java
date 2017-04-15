package com.mname.sync;

public class StuffConsumer implements Runnable {

	SomeQueue sQueue;

	public StuffConsumer(SomeQueue sQueue) {

		this.sQueue = sQueue;
		new Thread(this, "Потребитель").start();
	}

	@Override
	public void run() {

		while (true && sQueue.stuffCount < 20) {
			sQueue.get();
		}

	}

}
