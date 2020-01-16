package oop.ch12.IO.v04.CharacterUnitStream.fileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		
		int i;
		
		while ( ( i = fis.read() ) != -1 ) {
			
			System.out.print((char)i);
			
		}
		
		fis.close();
		
		/*
		 * 
		 * 출력 결과, 한글을 다 깨지고 영어만 정상적으로 출력된다.
		 * 
		 */
		
	}
	
}
