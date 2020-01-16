package oop.ch12.IO.v03.biteUnitStream.fileOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest3 {

	public static void main(String[] args) {
		
		/*
		 * 
		 *   InputStream, OutputStream 동시 사용
		 * 
		 */
		
		byte[] bs = new byte[26]; // 모든 알파벳을 넣을 byte 배열
		byte data = 65;
		 
		for (int i=0; i<bs.length; i++) { // 65(A)부터 90(Z)까지 배열에 입력
			bs[i] = data;
			data++;
		}
		
		try ( FileOutputStream fos = new FileOutputStream("alpha.txt", true); FileInputStream fis = new FileInputStream("alpha.txt"); ) {
			
			fos.write(bs); // byte 배열을 매개변수로 받는 write() 메서드 사용하여 alpha.txt 파일에 데이터 입력
			
			int ch;
			
			while ( ( ch = fis.read() ) != -1 ) { // 생성된 alpha.txt 파일 읽기
				
				System.out.print((char)ch);
				
			}
			
		} catch (IOException e) {
			System.out.println(e); 
		}
		
	}
	
}
