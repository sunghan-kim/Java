package oop.ch07.v01.interfaceBasic;

public abstract class Calculator implements Calc { // �������̽��� ��ӹ޴� ���, extends Ű���� ��� implements Ű���带 ����Ѵ�.

	// Calc �������̽��� "����"�� Ŭ���� (Calc.interface <- - - - - Calculator.java, �������� ǥ��)
		
	// Calc �������̽��� �߻� �޼��� �� �Ϻθ� ������ Ŭ�����μ�, �߻� Ŭ�����̴�.
	
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	// Calc �������̽��� 4���� �߻� �޼��� �߿� 2���� �ش� Ŭ�������� �����Ͽ����Ƿ�, �ش� Ŭ������ �߻� Ŭ������ �����Ǿ�� �Ѵ�.
	
	
}
