package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary2 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary2() {
		books.add("�¹� ��� 1");
		books.add("�¹� ��� 2");
		books.add("�¹� ��� 3");
	}
	
	public synchronized String lendBook() { // critical section's method sync
		
		// ���ҽ��� ��� �������� ������ �� ������ ���� -> ������ �л����� å�� �� ������ ������ ����
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
			
			String title = LibraryMain2.library.lendBook(); // ����
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5�� ���� å�� ����
			LibraryMain2.library.returnBook(title); // �ݳ�
			
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
		 * ���ҽ��� ������(å�� 3��)�̰�, thread�� �� ���� ��� (�л� 6��)
		 * 
		 *   - IndexOutOfBoundsException �߻�
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
