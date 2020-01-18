package oop.ch13.thread.v01.threadImplement;

/*
 * 
 * # Thread 구현 1
 * 
 *   - Thread 클래스를 상속받아 구현
 * 
 */
class MyThread extends Thread {
	
	public void run() { // Thread 클래스를 상속받은 경우, run() 메서드를 정의해야 한다.
		
		int i;
		
		for (i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				sleep(100); // 재우기 // sleep() Thread 클래스의 static 메서드이다. 
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
		
		th1.start(); // start() 메서드를 통해 Thread를 실행한다.
		th2.start();
		
		System.out.println("end");
		
		/*
		 * 
		 * 2개의 Thread가 차례대로 수행된다.
		 * 
		 *  - main Thread : main 메서드의 Thread가 먼저 수행되어 "start"와 "end"가 출력된다.
		 *  - 그런 다음 th1, th2가 수행된다.
		 * 
		 */
		
	}
	
}
