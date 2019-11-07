package com.lti.threads;

public class MyThreadRunnable implements Runnable { 
						
	public void run(){
		for (int i = 0; i < 3; i++) { 
			System.out.println("Run by "+Thread.currentThread().getName()+""+i); //currentThread is a method in Thread class and getName() is an instance method
			/*try {
				Thread.sleep(10*1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}*/
		}
	}
	

	public static void main(String[] args) throws InterruptedException{ 
		MyThreadRunnable m1 = new MyThreadRunnable(); 
		MyThreadRunnable m2 = new MyThreadRunnable();
		MyThreadRunnable m3 = new MyThreadRunnable();
		Thread t1=new Thread(m1); //start method is present only in thread thats why we need to create an object of thread class
		Thread t2=new Thread(m2);
		Thread t3=new Thread(m3);
		t1.setName("Vaidehi");
		t2.setName("Sagarika");
		t3.setName("Sava");
		t1.start();
		t1.join(); // every join must come after the start of that thread and before the start of the other thread
		t2.start();
		t2.join();
		t3.start();
		// System.out.println("Main ends"); //displayed first before any thread.
		t3.join();
		System.out.println("Main ends"); //displayed last only if join is written before it
	}

}
