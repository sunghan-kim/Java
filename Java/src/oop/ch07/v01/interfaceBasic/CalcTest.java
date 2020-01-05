package oop.ch07.v01.interfaceBasic;

public class CalcTest {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Calc.interface, Calculator.java, CompleteCalc.java 중 new 키워드를 이용해 인스턴스화할 수 있는 객체는 "CompleteCalc.java" 만이 가능하다.
		 * 
		 *   - Calc.interface : 인터페이스이므로 인스턴스화 불가능
		 *   
		 *   - Calculator.java : 추상 클래스이므로 인스턴스화 불가능
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
