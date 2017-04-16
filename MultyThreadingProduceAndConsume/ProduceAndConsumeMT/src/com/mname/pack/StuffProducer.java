package com.mname.pack;

public class StuffProducer implements Runnable {

	SomeQueue q;

	public StuffProducer(SomeQueue q) {
		this.q = q;
		new Thread(this, "Поставщик").start();
	}

	@Override
	public void run() {
		int i = 0;
		// ограничить передачу до обозреваемого значения
		while (true && q.numToDeliver < 20) {
			q.put(i++);
		}
	}

}
