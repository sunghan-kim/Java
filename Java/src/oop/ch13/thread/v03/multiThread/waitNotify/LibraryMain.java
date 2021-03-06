package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("�¹� ��� 1");
		books.add("�¹� ��� 2");
		books.add("�¹� ��� 3");
		books.add("�¹� ��� 4");
		books.add("�¹� ��� 5");
		books.add("�¹� ��� 6");
	}
	
	public String lendBook() {
		
		Thread t = Thread.currentThread();
		
		String title = books.remove(0);
		System.out.println(t.getName() + ":" + title + " lend");
		return title;
	}
	
	public void returnBook(String title) {
		
		Thread t = Thread.currentThread();
		
		books.add(title);
		
		System.out.println(t.getName() + ":" + title + " return");
	}
	
}

class Student extends Thread {
	
	public void run() {
		
		try {
			
			String title = LibraryMain.library.lendBook(); // ����
			sleep(5000); // 5�� ���� å�� ����
			LibraryMain.library.returnBook(title); // �ݳ�
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}

public class LibraryMain {

	public static FastLibrary library = new FastLibrary();
	
	public static void main(String[] args) {
		
		Student std1 = new Student();
		Student std2 = new Student();
		Student std3 = new Student();
		
		std1.start();
		std2.start();
		std3.start();
		
	}
	
}
