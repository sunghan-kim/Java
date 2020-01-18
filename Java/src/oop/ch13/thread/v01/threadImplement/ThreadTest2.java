package oop.ch13.thread.v01.threadImplement;

/*
 * 
 * # Thread 구현 2
 * 
 *   - Runnable 인터페이스를 implements 하여 구현
 * 
 */
class MyThread2 implements Runnable {

	@Override
	public void run() { // run() 추상 메서드를 재정의해야 한다.
		
		int i;
		
		for (i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(100); // Thread 클래스의 sleep() 메서드 사용 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}
		}
		
	}
	

	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		MyThread2 runner1 = new MyThread2();
		Thread th1 = new Thread(runner1);
		
		th1.start();
		
		MyThread2 runner2 = new MyThread2();
		Thread th2 = new Thread(runner2);
		
		th2.start();
		
		System.out.println("end");
		
		/*
		 * 
		 * 
		 * 
		 */
		
	}
	
}
