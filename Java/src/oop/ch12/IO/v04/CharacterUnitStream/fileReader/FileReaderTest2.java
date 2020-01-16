package oop.ch12.IO.v04.CharacterUnitStream.fileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		
		/*
		 * 
		 * InputStreamReader ��� ���� ��Ʈ������ fis�� ���θ� �ѱ۵� ��� �����ϴ�.
		 * 
		 */
		InputStreamReader isr = new InputStreamReader(fis);
		
		int i;
		
		while ( ( i = isr.read() ) != -1 ) {
			
			System.out.print((char)i);
			
		}
		
		isr.close(); // ���� ��Ʈ��(isr)�� close() �ϸ� ���� ��Ʈ��(fis)�� �Բ� close() �ȴ�.
		
		/*
		 * 
		 * ����(socket)���� �����͸� ���� ���� ������ ����Ʈ ������ �о�� �ϴ� ��, �� �� InputStreamReader ��� ���� ��Ʈ���� ����ϸ� �ȴ�.
		 * 
		 */
		
	}
	
}
