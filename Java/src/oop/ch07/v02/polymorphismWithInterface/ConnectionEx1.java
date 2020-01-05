package oop.ch07.v02.polymorphismWithInterface;

import java.sql.Connection;

public class ConnectionEx1 {

	Connection conn;
	
	/*
	 * 
	 * Interface Connection
	 * 
	 *   Connection : 인터페이스
	 *   
	 *     - Connection 인터페이스의 추상 메서드는 Oracle, MySql, MSSQL 에서 구현하여 jar 파일의 라이브러리를 제공한다.
	 *     
	 *     - Oracle DB에 연결해서 퀴리문을 수행하고자 할 때 jar 를 import 하고 Connection 인터페이스의 명세만 참고하여 사용하게 된다.
	 *     
	 *     - Oracle에서 jar 파일 내부에서 구현한 Connection 인터페이스의 추상 메서드 구현 로직은 몰라도 된다.
	 *     
	 *     - Connection 인터페이스에 정의된 명세만을 참고하여 해당 메서드를 사용하면 된다.
	 * 
	 */
	
}
