package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		System.out.println("입력:");
		
		try {
			
			int i;
			
			while ( (i = System.in.read()) != '\n' ) { // 여러개의 문자 입력 (엔터 치기 전 까지)
				
				System.out.print((char)i);
				
			}
			
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
