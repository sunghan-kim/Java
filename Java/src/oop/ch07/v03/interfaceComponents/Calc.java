package oop.ch07.v03.interfaceComponents;

public interface Calc {

	double PI = 3.14;
	int ERROR = -999999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	// ����Ʈ �޼���
	default void description() {
		System.out.println("���� ���⸦ �����մϴ�.");
		
		// private method�� ����Ʈ �޼��忡�� ���
		//myMethod();
		
	}
	
	// ����(static) �޼��� : ����Ʈ �޼��� ���� �ν��Ͻ��� �����ؼ� ����ؾ� �ϴµ� ����, static �޼����� ��� �ν��Ͻ� ���� ���� �������̽� Ÿ������ �ٷ� ��� ����
	static int total(int[] arr) {
		int total = 0;
		
		for (int i : arr) {
			total += i;
		}
		
		// private static �޼��带 static �޼��� ���ο��� ��� ����
		//mystaticMethod();
		
		return total;
		
		
		
	}
	
	// private �޼��� (java 9 ���� ��� ����)
	/*
	private void myMethod() {
		System.out.println("private Method");
	}
	*/
	
	// private static �޼���� static �޼��� �ȿ��� ����� �� �ִ�.
	/*
	private static void mystaticMethod() {
		System.out.println("private static method");
	}
	*/
	
}
