package oop.ch13.thread.v03.multiThread.waitNotify;

import java.util.ArrayList;

class FastLibrary {
	
	public ArrayList<String> books = new ArrayList<String>();
	
	public FastLibrary() {
		books.add("ÅÂ¹é »ê¸Æ 1");
		books.add("ÅÂ¹é »ê¸Æ 2");
		books.add("ÅÂ¹é »ê¸Æ 3");
		books.add("ÅÂ¹é »ê¸Æ 4");
		books.add("ÅÂ¹é »ê¸Æ 5");
		books.add("ÅÂ¹é »ê¸Æ 6");
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
			
			String title = LibraryMain.library.lendBook(); // ºô¸²
			sleep(5000); // 5ÃÊ µ¿¾È Ã¥À» ÀÐÀ½
			LibraryMain.library.returnBook(title); // ¹Ý³³
			
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
