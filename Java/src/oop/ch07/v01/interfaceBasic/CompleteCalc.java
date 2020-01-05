package oop.ch07.v01.interfaceBasic;

public class CompleteCalc extends Calculator { // Calc �������̽��� �߻� �޼��� �� �Ϻΰ� ������ Calcuator �߻� Ŭ������ ��� �޴´�.

	// Calc �������̽��� ��� �߻� �޼��带 ������ Ŭ�����μ�, �߻� Ŭ������ �ƴϴ�.
	
	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if ( num2 == 0 ) {
			return ERROR; // ERROR : Calc �������̽����� ���ǵ� ���
		}
		return num1 / num2;
	}

	// Calc �������̽����� ����� 4���� �߻� �޼��� �� 2���� �߻� �޼���(add, substract)�� Calculator �߻� Ŭ�������� ���������Ƿ�
	// CompleteCalc Ŭ�������� Calculator �߻� Ŭ������ ����ϰ� �Ǹ�, ���� �������� ���� 2���� �߻� �޼���(times, divide)�� �ش� Ŭ�������� �����ϰ� �ȴ�.
	
	
	public void showInfo() {
		System.out.println("��� �����Ͽ����ϴ�.");
	}
	
}
