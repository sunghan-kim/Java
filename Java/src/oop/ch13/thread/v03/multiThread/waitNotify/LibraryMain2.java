package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary2 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary2() {
		books.add("태백 산맥 1");
		books.add("태백 산맥 2");
		books.add("태백 산맥 3");
	}
	
	public synchronized String lendBook() { // critical section's method sync
		
		// 리소스가 사용 가능하지 않으면 못 빌리게 설정 -> 나머지 학생들이 책을 못 빌리는 것으로 끝남
		if ( books.size() == 0 ) {
			return null;
		}
		
		Thread t = Thread.currentThread();
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) { // critical section's method sync
		
		Thread t = Thread.currentThread();
		
		books.add(title);
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student2 extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain2.library.lendBook(); // 빌림
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5초 동안 책을 읽음
			LibraryMain2.library.returnBook(title); // 반납
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}

public class LibraryMain2 {

	public static FastLibrary2 library = new FastLibrary2();
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * 리소스는 한정적(책이 3권)이고, thread가 더 많을 경우 (학생 6명)
		 * 
		 *   - IndexOutOfBoundsException 발생
		 * 
		 */
		
		Student2 std1 = new Student2();
		Student2 std2 = new Student2();
		Student2 std3 = new Student2();
		Student2 std4 = new Student2();
		Student2 std5 = new Student2();
		Student2 std6 = new Student2();
		
		std1.start();
		std2.start();
		std3.start();
		std4.start();
		std5.start();
		std6.start(); 
		
	}
	
}
