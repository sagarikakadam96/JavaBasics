package com.lti.threads;

class TimApple implements Runnable {

	public void run() {
		PrintApple();
	}
	void PrintApple() {
		System.out.println("Apple");
	}
}	
class TimBanana implements Runnable  {

	public void run() {
		PrintBanana();
	}
	void PrintBanana() {
		System.out.println("Banana");
	}

}	
class Tim{
	
	public static void main(String[] args) {
		TimApple m1 = new TimApple();
		TimBanana m2 = new TimBanana();
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.setName("Vaidehi");
		t2.setName("Sagarika");
		t1.start();
		t2.start();
	}

}
