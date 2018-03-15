package com.incedo;

public class HoldValue {
	private int contant;
	private boolean flag = true;
	public synchronized  void  checkThreadWait(){
		try {
			while(flag == true){
			System.out.println("before wait");
			wait();
			System.out.println("after wait");
			}
		} catch (InterruptedException e) {
			
			//e.printStackTrace();
		}
		System.out.println("finish wait");
	}
	
	public synchronized void stopWait(){
		System.out.println("before notify");
		notify();
		flag = false;
		System.out.println("after notify");
	}

}
