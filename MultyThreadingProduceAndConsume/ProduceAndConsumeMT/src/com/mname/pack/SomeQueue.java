package com.mname.pack;

public class SomeQueue {

	int numToDeliver;
	boolean valueSet = false;// флаг для установки нового значения

	synchronized int get() {
		while (!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Исклучение типа\"Interrupted Exception\"...");
			}
		}

		System.out.println("Получено: " + numToDeliver);
		valueSet = false;
		notify();
		return numToDeliver;
	}

	synchronized void put(int numToDeliver) {
		while (valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Исклучение типа\"Interrupted Exception\"...");
			}
		}

		this.numToDeliver = numToDeliver;
		valueSet = true;
		System.out.println("Отправлено: " + numToDeliver);
		notify();
	}

}
