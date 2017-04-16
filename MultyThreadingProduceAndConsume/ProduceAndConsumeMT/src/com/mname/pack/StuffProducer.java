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
		while (true) {
			q.put(i++);
		}
	}

}
