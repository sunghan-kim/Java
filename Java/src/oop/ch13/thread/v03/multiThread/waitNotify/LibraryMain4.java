package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary4 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary4() {
		books.add("태백 산맥 1");
		books.add("태백 산맥 2");
		books.add("태백 산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException { // critical section's method sync

		Thread t = Thread.currentThread();
		
		// wait() 메서드 활용
		while( books.size() == 0 ) { // if 문 대신 while 문을 사용하여 notifyAll() 에 의해 다시 깨어난 thread를 다시 wait() 로 상태 전환
			System.out.println(t.getName() + " waiting start");
			wait(); // current thread를 기다리게 한다.
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) { // critical section's method sync
		
		Thread t = Thread.currentThread();
		
		books.add(title);
		
		notifyAll(); // 모든 thread를 깨움 
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student4 extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain4.library.lendBook(); // 빌림
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5초 동안 책을 읽음
			LibraryMain4.library.returnBook(title); // 반납
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}

public class LibraryMain4 {

	public static FastLibrary4 library = new FastLibrary4();
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 리소스는 한정적(책이 3권)이고, thread가 더 많을 경우 (학생 6명)
		 * 
		 *   - IndexOutOfBoundsException 발생
		 * 
		 */
		
		Student4 std1 = new Student4();
		Student4 std2 = new Student4();
		Student4 std3 = new Student4();
		Student4 std4 = new Student4();
		Student4 std5 = new Student4();
		Student4 std6 = new Student4();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start(); 
		
	}
	
}
