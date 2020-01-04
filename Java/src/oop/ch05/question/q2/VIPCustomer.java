package oop.ch05.question.q2;

public class VIPCustomer extends Customer {

	private int agentID;
	double salesRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		this.agentID = agentID;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
	public int getAgentID() {
		return agentID;
	}
	
}
