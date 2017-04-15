package com.mname.sync;

public class Start {
	public static void main(String[] args) {
		SomeQueue sQueue = new SomeQueue();
		new StuffProducer(sQueue);
		new StuffConsumer(sQueue);

	}
}
