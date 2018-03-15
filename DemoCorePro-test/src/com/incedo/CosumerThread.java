package com.incedo;

public class CosumerThread extends Thread {
	private HoldValue holdValue;
	public CosumerThread(HoldValue hv){
		holdValue = hv;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		holdValue.stopWait();
		
	}
	
}
