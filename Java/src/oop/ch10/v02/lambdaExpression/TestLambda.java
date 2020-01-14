package oop.ch10.v02.lambdaExpression;

interface PrintString {
	
	void showString(String str);
	
}

public class TestLambda {

	public static void main(String[] args) {
		
		// 1. 람다식을 자료형 기반으로 선언
		PrintString lambdaStr = s -> System.out.println(s);
		
		lambdaStr.showString("Test");
		
		System.out.println("================");
		
		// 2. 람다식을 매개변수로 전달
		showMyString(lambdaStr);
		
		System.out.println("================");
		
		// 3. 람다식을 메서드(returnString())의 반환 값으로 사용
		PrintString test = returnString();
		
		test.showString("Test3");
		
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s -> System.out.println(s + "!!!");
	}
	
}
