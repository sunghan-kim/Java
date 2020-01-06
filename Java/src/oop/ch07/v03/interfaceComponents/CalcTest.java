package oop.ch07.v03.interfaceComponents;

public class CalcTest {

	public static void main(String[] args) {

		Calc calc = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		// ����Ʈ �޼���
		calc.description(); // �����ǵ� ����Ʈ �޼��尡 ���� ��� -> �������̽��� ����Ʈ �޼��� ȣ��
							// �����ǵ� ����Ʈ �޼��尡 �ִ� ��� -> �����ǵ� ����Ʈ �޼��� ȣ��
		
		
		// ����(static) �޼��� : �������̽� Ÿ���� ���� �ٷ� ȣ�� ���� (�ν��Ͻ� ������ �ʿ� x)
		int[] arr = {1,2,3,4,5};
		int total = Calc.total(arr);
		System.out.println(total);
		
		
		// private �޼��带 �������̽� ������ ������ �� �ش� �޼��带 ����Ʈ �޼��� �ȿ��� ����ϸ� �Ʒ� �ڵ带 ���� ������ �� �ִ�.
		calc.description(); 
		
	}
	
}
