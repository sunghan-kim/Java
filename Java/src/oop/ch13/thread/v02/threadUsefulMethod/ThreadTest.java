package oop.ch13.thread.v02.threadUsefulMethod;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Thread t = Thread.currentThread(); // static �޼���, ���� ���� �ִ� Thread �� �����´�. (main Thread)
		System.out.println(t); // [Thread �̸�, �켱����, �׷��̸�]
		 
		System.out.println("end");

		
	}
	
}
