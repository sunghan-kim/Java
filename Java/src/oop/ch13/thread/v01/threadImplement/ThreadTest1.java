package oop.ch13.thread.v01.threadImplement;

/*
 * 
 * # Thread ���� 1
 * 
 *   - Thread Ŭ������ ��ӹ޾� ����
 * 
 */
class MyThread extends Thread {
	
	public void run() { // Thread Ŭ������ ��ӹ��� ���, run() �޼��带 �����ؾ� �Ѵ�.
		
		int i;
		
		for (i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				sleep(100); // ���� // sleep() Thread Ŭ������ static �޼����̴�. 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}
	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		
		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		th1.start(); // start() �޼��带 ���� Thread�� �����Ѵ�.
		th2.start();
		
		System.out.println("end");
		
		/*
		 * 
		 * 2���� Thread�� ���ʴ�� ����ȴ�.
		 * 
		 *  - main Thread : main �޼����� Thread�� ���� ����Ǿ� "start"�� "end"�� ��µȴ�.
		 *  - �׷� ���� th1, th2�� ����ȴ�.
		 * 
		 */
		
	}
	
}
