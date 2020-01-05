package oop.ch07.v01.interfaceBasic;

public interface Calc {

	// �������̽����� ������ ������ ������ �������� ����� ��ȯ�� (abstract Ű���带 �������� �ʾƵ� �ȴ�.)
	double PI = 3.14;
	int ERROR = -999999999;
	
	// �������̽����� ������ �޼���� ������ �������� �߻� �޼���� ��ȯ�� (abstract Ű���带 �������� �ʾƵ� �ȴ�.)
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	/*
	 * 
	 *   "�޼��带 ������ �� �ִ�"�� ���� �ǹ�
	 *   
	 *     - ��ȯ��(String), �Լ�(�޼���)�� �̸�(stringAdd), �Ű�����(s1, s2) �� 3���� ��Ҹ� "�Լ��� signature" ��� �Ѵ�.
	 *     
	 *     - "�޼��带 ������ �� �ִ�" ��� ���� �Լ��� �ñ״�ó���� �̿��Ͽ� �޼��尡 ��� ������ ���� ���� ���̵� �ִٴ� ���� �ǹ��Ѵ�.  
	 * 
	 */
	
}
