package com.mname.sync;

public class StuffProducer implements Runnable {

	SomeQueue sQueue;

	public StuffProducer(SomeQueue sQueue) {
		this.sQueue = sQueue;
		new Thread(this, "Поставщик").start();
	}

	@Override
	public void run() {
		int i = 0;
		while (true && sQueue.stuffCount < 20) {
			sQueue.put(i++);
		}

	}

}
