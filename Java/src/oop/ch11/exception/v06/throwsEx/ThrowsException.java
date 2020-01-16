package oop.ch11.exception.v06.throwsEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException { 
		// throws�� ���� ���ܸ� �̷��, �ش� �޼��带 ȣ���ϴ� �κп��� ó���ؾ� �Ѵ�.
		
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException �߻��� �� ����
		Class c = Class.forName(className); // ClassNotFoundException �߻��� �� ����
		
		return c;
	}
	
	public static void main(String[] args) { // main �޼��忡�� throws�� �ϸ� ����ӽ����� �Ѿ ó���� �ȵǹǷ�, try-catch ó���� ����� �Ѵ�.
		
		ThrowsException test = new ThrowsException();
		
		
		try {
			
			//test.loadClass("b.txt", "java.lang.string"); // FileNotFoundException �߻�
			//test.loadClass("a.txt", "java.lang.string"); // ClassNotFoundException �߻�
			test.loadClass("a.txt", "java.lang.String"); // ���� ���� �� "end" ��� 
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
			
			System.out.println(e); // �� �κп� �߻��� ���ܿ� ���� �α� ��� 
			
		} catch (Exception e) { // default Exception : �� �ܿ� �߻��� �� �ִ� ���� ���� ���ܸ� �� �κп��� ó�� (���� �������� �ɾ�� �Ѵ�.)
			
			System.out.println(e); 
			
		}
		
		
		System.out.println("end");
		
		/*
		 * 
		 * ���� ó���� �ϴ� �κ��� �����ϴ� ���� �α׸� ����� �κ����� �� �پ��� ��Ҹ� ����Ͽ� �����Ѵ�.
		 * 
		 */
		
		
		
	}

}
