package oop.ch10.v02.lambdaExpression;

interface PrintString {
	
	void showString(String str);
	
}

public class TestLambda {

	public static void main(String[] args) {
		
		// 1. ���ٽ��� �ڷ��� ������� ����
		PrintString lambdaStr = s -> System.out.println(s);
		
		lambdaStr.showString("Test");
		
		System.out.println("================");
		
		// 2. ���ٽ��� �Ű������� ����
		showMyString(lambdaStr);
		
		System.out.println("================");
		
		// 3. ���ٽ��� �޼���(returnString())�� ��ȯ ������ ���
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
