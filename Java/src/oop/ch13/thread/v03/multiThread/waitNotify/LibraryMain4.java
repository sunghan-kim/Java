package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary4 {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary4() {
		books.add("�¹� ��� 1");
		books.add("�¹� ��� 2");
		books.add("�¹� ��� 3");
	}
	
	public synchronized String lendBook() throws InterruptedException { // critical section's method sync

		Thread t = Thread.currentThread();
		
		// wait() �޼��� Ȱ��
		while( books.size() == 0 ) { // if �� ��� while ���� ����Ͽ� notifyAll() �� ���� �ٽ� ��� thread�� �ٽ� wait() �� ���� ��ȯ
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
		
		notifyAll(); // ��� thread�� ���� 
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student4 extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain4.library.lendBook(); // ����
			
			if ( title == null ) {
				return;
			}
			
			sleep(5000); // 5�� ���� å�� ����
			LibraryMain4.library.returnBook(title); // �ݳ�
			
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
		 * ���ҽ��� ������(å�� 3��)�̰�, thread�� �� ���� ��� (�л� 6��)
		 * 
		 *   - IndexOutOfBoundsException �߻�
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
