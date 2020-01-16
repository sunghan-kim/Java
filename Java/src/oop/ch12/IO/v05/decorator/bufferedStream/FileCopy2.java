package oop.ch12.IO.v05.decorator.bufferedStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 보조 스트림 종류의 하나인 Buffered 스트림을 이용해 파일을 복사하는 데 얼만큼의 시간이 걸리는 지 확인 
		 * 
		 */
		
		long milliseconds = 0; // 시간이 얼마나 걸리는 지 확인
		
		// a.zip : 3.7MB 크기의 파일
		try ( FileInputStream fis = new FileInputStream("a.zip"); FileOutputStream fos = new FileOutputStream("copy2.zip");
				BufferedInputStream bis = new BufferedInputStream(fis); BufferedOutputStream bos = new BufferedOutputStream(fos)) {  
			 
			 milliseconds = System.currentTimeMillis();
			 
			 int i;
			 
			 while ( ( i = bis.read() ) != -1 ) { 
				 
				 bos.write(i);
				 
			 }
			 
			 milliseconds = System.currentTimeMillis() - milliseconds; // 걸린 시간
			 
		} catch (IOException e) {
			 
			System.out.println(e);
			 
		}
		
		System.out.println("시간 : " + milliseconds); // 3.7MB 크기의 파일을 복사하는 데 126밀리초(0.1초)가 걸림
		
		/*
		 * 
		 * 바이트 단위 스트림을 이용하여 파일을 복사하는 데 비해 Buffered 보조 스트림을 이용하면 약 443배(55927 vs 126)의 속도 향상이 이루어진다.
		 * 
		 *   - Buffered 스트림은 읽고 쓸 때 빠른 속도를 보인다.
		 * 
		 */
		  
		
	}
	
}
