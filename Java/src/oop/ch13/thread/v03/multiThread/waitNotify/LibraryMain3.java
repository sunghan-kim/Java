package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary3 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary3() {
		books.add("태백 산맥 1");
		books.add("태백 산맥 2");
		books.add("태백 산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException { // critical section's method sync

		Thread t = Thread.currentThread();
		
		// wait() 메서드 활용
		if ( books.size() == 0 ) {
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
		
		notify(); // 책이 반납될 때 notify() 메세드로 wait() 중인 thread를 runnable 한 상태로 변경
		
		/*
		 * 
		 * notify() 로 인해 깨어나는 thread가 공평하지 않을 수 있다.
		 * 
		 */
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student3 extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain3.library.lendBook(); // 빌림
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5초 동안 책을 읽음
			LibraryMain3.library.returnBook(title); // 반납
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}

public class LibraryMain3 {

	public static FastLibrary3 library = new FastLibrary3();
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 리소스는 한정적(책이 3권)이고, thread가 더 많을 경우 (학생 6명)
		 * 
		 *   - IndexOutOfBoundsException 발생
		 * 
		 */
		
		Student3 std1 = new Student3();
		Student3 std2 = new Student3();
		Student3 std3 = new Student3();
		Student3 std4 = new Student3();
		Student3 std5 = new Student3();
		Student3 std6 = new Student3();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start(); 
		
	}
	
}
