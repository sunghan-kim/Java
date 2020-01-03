package oop.ch04.question.q1;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private ArrayList<Book> bookList;
	
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String bookTitle) {
		
		Book book = new Book(bookTitle);
		
		bookList.add(book);
		
	}
	
	public void showStudentInfo() {
		
		String result = studentName + " �л��� ���� å�� : ";
		
		for (Book book : bookList) {
			result += book.getBookTitle() + " ";
		}
		
		result += "�Դϴ�.";
		
		System.out.println(result);
		
	}
	
}
