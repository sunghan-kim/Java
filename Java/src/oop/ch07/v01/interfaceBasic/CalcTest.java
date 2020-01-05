package oop.ch07.v01.interfaceBasic;

public class CalcTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Calc.interface, Calculator.java, CompleteCalc.java �� new Ű���带 �̿��� �ν��Ͻ�ȭ�� �� �ִ� ��ü�� "CompleteCalc.java" ���� �����ϴ�.
		 * 
		 *   - Calc.interface : �������̽��̹Ƿ� �ν��Ͻ�ȭ �Ұ���
		 *   
		 *   - Calculator.java : �߻� Ŭ�����̹Ƿ� �ν��Ͻ�ȭ �Ұ���
		 * 
		 */

		CompleteCalc calc = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		calc.showInfo();
		
		
	}
	
}
