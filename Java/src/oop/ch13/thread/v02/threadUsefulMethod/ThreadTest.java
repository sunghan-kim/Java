package oop.ch13.thread.v02.threadUsefulMethod;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		
		Thread t = Thread.currentThread(); // static 메서드, 현재 돌고 있는 Thread 를 가져온다. (main Thread)
		System.out.println(t); // [Thread 이름, 우선순위, 그룹이름]
		 
		System.out.println("end");

		
	}
	
}
