package com.mname.pack;

public class SomeQueue {

	int numToDeliver;

	int get() {
		System.out.println("Получено: " + numToDeliver);
		return numToDeliver;
	}

	void put(int numToDeliver) {
		this.numToDeliver = numToDeliver;
		System.out.println("Отправлено: " + numToDeliver);
	}

}
