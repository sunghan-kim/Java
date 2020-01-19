package oop.ch13.thread.v02.threadUsefulMethod;

public class InterruptTest extends Thread {

	public void run() {
		
		int i;
		
		for (i=0; i<100; i++) {
			System.out.println(i);
		}
		
		try {
			
			sleep(5000); // 5��
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
			System.out.println("Wake!!");
			
		} 
		
	}
	
	public static void main(String[] args) {
		
		InterruptTest test = new InterruptTest();
		
		test.start();
		
		/*
		 * sleep(), wait() ���� ���� �߿���  interrupt() �� ȣ���ϸ� Exception���� ����
		 */
		test.interrupt(); 
		
		System.out.println("end");
		
	}
	
}
