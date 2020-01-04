 package oop.ch05.v01.inheritance;

public class Customer {

	/*
	 * 
	 * Customer 클래스
	 * 
	 *   맴버 변수
	 *   
	 *     - customerID
	 *     
	 *       - 고객 아이디
	 *       
	 *     - customerName 
	 *       
	 *       - 고객 이름
	 *       
	 *     - customerGrade
	 *     
	 *       - 고객 등급
	 *       - 기본 생성자에서 지정되는 기본 등급은 SILVER 이다.
	 *       
	 *     - bonusPoint
	 *     
	 *       - 고객의 보너스 포인트
	 *       - 고객이 제품을 구매할 경우 누적되는 보너스 포인트
	 *       
	 *     - bonusRatio
	 *     
	 *       - 보너스 포인트 적립 비율
	 *       - 고객이 제품을 구매할 때 구매 금액의 일정 비율이 보너스 포인트로 적립됨
	 *       - 이 때 계산되는 적립 비율
	 *       - 기본 생성자에서 지정되는 적립 비율 = 1% (즉, 10,000원짜리를 사면 100원이 적립됨)
	 *       
	 * 
	 */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		
		
	}
	
	// calcPrice() : 가격 계산 메서드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 적립
		return price;
	}
	
	// showCustomerInfo() : 고객 정보 출력
	public String showCustomerInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 적립된 보너스 포인트는 " + bonusPoint + "점 입니다.";
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	
	
}
