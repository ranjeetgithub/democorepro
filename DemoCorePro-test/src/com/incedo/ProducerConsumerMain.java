package com.incedo;

public class ProducerConsumerMain {

	public static void main(String[] args) {
		HoldValue hv = new HoldValue();
		producerThread pt = new producerThread(hv);
		CosumerThread ct = new CosumerThread(hv);
		ct.start();
		pt.start();
		

	}

}
