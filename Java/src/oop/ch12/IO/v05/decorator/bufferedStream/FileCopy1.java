package oop.ch12.IO.v05.decorator.bufferedStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void main(String[] args) {
		
		/*
		 * 
		 * 바이트 단위 스크림 클래스를 이용해 파일을 복사하는 데 얼만큼의 시간이 걸리는 지 확인 
		 * 
		 */
		
		long milliseconds = 0; // 시간이 얼마나 걸리는 지 확인
		
		// a.zip : 3.7MB 크기의 파일
		try ( FileInputStream fis = new FileInputStream("a.zip"); FileOutputStream fos = new FileOutputStream("copy.zip") ) { 
			 
			 milliseconds = System.currentTimeMillis();
			 
			 int i;
			 
			 while ( ( i = fis.read() ) != -1 ) { // 한 바이트씩 읽어서
				 
				 fos.write(i); // 한 바이트씩 쓰기
				 
			 }
			 
			 milliseconds = System.currentTimeMillis() - milliseconds; // 걸린 시간
			 
		} catch (IOException e) {
			 
			System.out.println(e);
			 
		}
		
		System.out.println("시간 : " + milliseconds); // 3.7MB 크기의 파일을 복사하는 데 55927밀리초(55초)가 걸림
		  
		
	}
	
}
