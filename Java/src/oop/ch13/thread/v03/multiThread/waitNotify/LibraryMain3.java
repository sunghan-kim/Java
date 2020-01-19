package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary3 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary3() {
		books.add("�¹� ��� 1");
		books.add("�¹� ��� 2");
		books.add("�¹� ��� 3");
	}
	
	public synchronized String lendBook() throws InterruptedException { // critical section's method sync

		Thread t = Thread.currentThread();
		
		// wait() �޼��� Ȱ��
		if ( books.size() == 0 ) {
			System.out.println(t.getName() + " waiting start");
			wait(); // current thread�� ��ٸ��� �Ѵ�.
			System.out.println(t.getName() + " waiting end");
		}
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public synchronized void returnBook(String title) { // critical section's method sync
		
		Thread t = Thread.currentThread();
		
		books.add(title);
		
		notify(); // å�� �ݳ��� �� notify() �޼���� wait() ���� thread�� runnable �� ���·� ����
		
		/*
		 * 
		 * notify() �� ���� ����� thread�� �������� ���� �� �ִ�.
		 * 
		 */
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student3 extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain3.library.lendBook(); // ����
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5�� ���� å�� ����
			LibraryMain3.library.returnBook(title); // �ݳ�
			
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
		 * ���ҽ��� ������(å�� 3��)�̰�, thread�� �� ���� ��� (�л� 6��)
		 * 
		 *   - IndexOutOfBoundsException �߻�
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
