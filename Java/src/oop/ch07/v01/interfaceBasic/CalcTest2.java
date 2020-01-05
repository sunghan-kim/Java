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
		
		//calc.showInfo(); <- ERROR // calc 의 타입은 Calc 이므로, CompleteCalc 클래스에서 구현된 showInfo() 메서드를 사용할 수 없다. (다운 캐스팅 하면 사용 가능)
		
		
		
	}
	
}
