package oop.ch07.v01.interfaceBasic;

public class CalcTest2 {

	public static void main(String[] args) {
		
		Calc calc = new CompleteCalc();
		
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		//calc.showInfo(); <- ERROR // calc �� Ÿ���� Calc �̹Ƿ�, CompleteCalc Ŭ�������� ������ showInfo() �޼��带 ����� �� ����. (�ٿ� ĳ���� �ϸ� ��� ����)
		
		
		
	}
	
}
