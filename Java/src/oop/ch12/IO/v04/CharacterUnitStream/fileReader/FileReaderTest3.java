package oop.ch12.IO.v04.CharacterUnitStream.fileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest3 {

	public static void main(String[] args) throws IOException {
		
		FileReader fis = new FileReader("reader.txt");
		
		int i;
		
		while ( ( i = fis.read() ) != -1 ) {
			
			System.out.print((char)i);
			
		}
		
		fis.close();
		
		/*
		 * 
		 * FileInputStream ��� FileReader�� ����ϸ� �ѱ��� ������ �ʰ� ���������� ��µȴ�.
		 * 
 		 */
		
	}
	
}
