package com.mname.pack;

public class StuffConsumer implements Runnable {

	SomeQueue q;

	public StuffConsumer(SomeQueue q) {
		this.q = q;
		new Thread(this, "Потребитель").start();
	}

	@Override
	public void run() {
		// ограничить потребление до обозреваемог значения
		while (true && q.numToDeliver < 20) {
			q.get();
		}

	}

}
