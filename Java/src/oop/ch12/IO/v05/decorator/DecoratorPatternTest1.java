package oop.ch12.IO.v05.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class DecoratorPatternTest1 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 
		 * 데코레이터 패턴
		 * 
		 *   - 보조 스트림의 매개변수로 또 다른 보조 스트림을 받을 수 있다.
		 *   
		 */
		
		Socket socket = new Socket(); // 소켓 사용
		
		// 1. 소캣에서 데이터를 읽어들일 때, InputStream을 통해 바이트 단위로 읽어들인다. (영문만 읽을 수 있다.)
		//socket.getInputStream().read();
		
		// 2. InputStreamReader 보조 스트림을 사용해 바이트 단위로 읽어들인 것을 문자로 읽어드릴 수 있다. (문자 단위로 읽을 수 있음)
		//InputStreamReader isr = new InputStreamReader(socket.getInputStream()); 
		
		// 3. 2번에서 InputStreamReader 보조 스트림으로 감싼 것을 BufferedReader 라는 보조 스트림의 매개변수로 전달하여 buffer 기능까지 사용할 수 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		br.readLine(); // readLine() : 문장에서 한 줄씩 읽을 수 있는 기능을 제공하는 BufferedReader의 메서드
		
		/*
		 * 
		 * 데코레이터 패턴을 상속으로 구현하게 되면 매우 복잡해진다.
		 * 
		 */
		
		  
	}			
	
}
