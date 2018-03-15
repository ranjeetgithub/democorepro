package com.incedo;

public class producerThread extends Thread {

	private HoldValue holdValue;
	public producerThread(HoldValue hv){
		holdValue = hv;
	}
	
	@Override
	public void run() {
		
		holdValue.checkThreadWait();
		
	}

}
