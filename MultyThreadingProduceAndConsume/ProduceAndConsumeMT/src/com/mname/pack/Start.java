package com.mname.pack;

public class Start {

	public static void main(String[] args) {
		SomeQueue q = new SomeQueue();
		new StuffProducer(q);
		new StuffConsumer(q);
	}
}
