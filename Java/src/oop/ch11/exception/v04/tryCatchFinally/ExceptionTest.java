package oop.ch11.exception.v04.tryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream("a.txt");
			// ������Ʈ ������ "a.txt" ������ �����ϸ� �� �κ��� ���������� ����Ǿ� catch �κ��� ������� �ʴ´�. 
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			return; // catch ���� �� return �� �ϸ� ���� �Ʒ��� end �� ��µ��� �ʴ´�.
			
		} finally {
			
			try {
				
				fis.close();
				System.out.println("finally");
				
			} catch (Exception e) {
				
				System.out.println(e);
				
			}
		}
		
		System.out.println("end");
		
	}
	
}
