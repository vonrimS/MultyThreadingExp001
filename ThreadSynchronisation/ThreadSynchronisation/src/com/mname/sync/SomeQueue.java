package com.mname.sync;

public class SomeQueue {

	int stuffCount;
	boolean valueSet = false;// флаг передачи очереди

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("\"InterruptedException\" перехвачен");
			}
		}

		System.out.println("Получено: " + stuffCount);
		valueSet = false;
		notify();
		return stuffCount;

	}

	synchronized void put(int stuffCount) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("\"InterruptedException\" перехвачен");
			}
		}

		this.stuffCount = stuffCount;
		valueSet = true;
		System.out.println("Отправлено: " + stuffCount);
		notify();

	}

}
