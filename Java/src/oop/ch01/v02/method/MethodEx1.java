package oop.ch01.v02.method;

public class MethodEx1 {

	/*
	 * 
	 * �޼��� (Method)
	 * 
	 *   - ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
	 *   - �޼��带 ���������ν� ��ü�� ����� ���� ��
	 *   - �޼����� �̸��� ����ϴ� �� (Ŭ���̾�Ʈ �ڵ�)�� �°� ����ϴ� ���� ����
	 *     - ex) getStudentName() <- camel notation
	 * 
	 */
	
	public static int addNum(int num1, int num2) {
		
		int result;
		
		result = num1 + num2;
		
		return result;
		
	}
	
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
		
	}
	
	public static int calcSum() {
		
		int sum = 0;
		int i;
		
		for (i=0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
	public static void main(String[] args) {
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		System.out.println(total);
		
		sayHello("�ȳ��ϼ���");
		
		int num = calcSum();
		
		System.out.println(num);
		
	}
	
}
