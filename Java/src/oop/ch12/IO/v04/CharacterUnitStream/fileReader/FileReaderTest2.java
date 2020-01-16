package oop.ch12.IO.v04.CharacterUnitStream.fileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReaderTest2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("reader.txt");
		
		/*
		 * 
		 * InputStreamReader 라는 보조 스트림으로 fis를 감싸면 한글도 출력 가능하다.
		 * 
		 */
		InputStreamReader isr = new InputStreamReader(fis);
		
		int i;
		
		while ( ( i = isr.read() ) != -1 ) {
			
			System.out.print((char)i);
			
		}
		
		isr.close(); // 보조 스트림(isr)을 close() 하면 원래 스트림(fis)도 함께 close() 된다.
		
		/*
		 * 
		 * 소켓(socket)에서 데이터를 읽을 때는 무조건 바이트 단위로 읽어야 하는 데, 이 때 InputStreamReader 라는 보조 스트림을 사용하면 된다.
		 * 
		 */
		
	}
	
}
