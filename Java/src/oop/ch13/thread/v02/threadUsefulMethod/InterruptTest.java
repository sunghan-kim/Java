package oop.ch13.thread.v02.threadUsefulMethod;

public class InterruptTest extends Thread {

	public void run() {
		
		int i;
		
		for (i=0; i<100; i++) {
			System.out.println(i);
		}
		
		try {
			
			sleep(5000); // 5초
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
			System.out.println("Wake!!");
			
		} 
		
	}
	
	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		
		test.start();
		
		/*
		 * sleep(), wait() 등의 상태 중에서  interrupt() 를 호출하면 Exception으로 빠짐
		 */
		test.interrupt(); 
		
		System.out.println("end");
		
	}
	
}
