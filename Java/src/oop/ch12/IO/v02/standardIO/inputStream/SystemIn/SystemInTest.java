package oop.ch12.IO.v02.standardIO.inputStream.SystemIn;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("입력:");
		
		try {
			
			int i = System.in.read(); // 반환값 : int (처음과 끝을 나타내는 "-1"을 받기 위해 반환값이 int로 지정됨)
			System.out.println(i);
			System.out.println((char)i);
			
		} catch (IOException e) {
			
			System.out.println(e);
			
		}
		
	}
	
}
