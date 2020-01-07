package oop.ch08.javaBasicClass.v02.string;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1 == str2); // false
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3 == str4); // true (상수풀에 저장되기 때문)
		
		System.out.println("==============================");
		
		String java = "java";
		String android = "android";
		
		System.out.println(System.identityHashCode(java)); // 1311053135
		
		java = java.concat(android);

		System.out.println(java);
		
		System.out.println(System.identityHashCode(java)); // 118352462
		
		// -> concat 전과 후의 주소가 다르다.
		
	}
	
}
