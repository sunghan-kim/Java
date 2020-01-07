package oop.ch08.javaBasicClass.v02.string;

public class StringBufferTest {

	public static void main(String[] args) {
		
		String java = "java";
		String android = "android";
		
		StringBuilder buffer = new StringBuilder(java);
		
		System.out.println(System.identityHashCode(buffer)); // 1311053135
		
		buffer.append(android);
		
		System.out.println(buffer.toString());
		
		System.out.println(System.identityHashCode(buffer)); // 1311053135
		
		// -> buffer는 append() 전 후로 동일한 주소를 가짐
		
	}
	
}
