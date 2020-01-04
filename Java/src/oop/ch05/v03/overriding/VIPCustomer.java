package oop.ch05.v03.overriding;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}

	// VIPCustomer Ŭ������ ��� Customer Ŭ������ �޸� calcPrice �޼��忡�� ���ݿ� �������� �����ϴ� ������ �ʿ��ϴ�. 
	// ���� Ŭ������ �޼���� �ٸ� ������ �޼��带 ���� Ŭ�������� �����ϱ� ���� �������̵�(overriding)�� ���� ������ �� �ִ�.
	// "���콺 ��Ŭ�� -> Source -> Override/Implement Methods" ���� �޼��带 override �� �� �ִ�.
	
	@Override // Annotation : �����Ϸ����� �� �޼���� Override �� �޼����� ���� �����ش�.
	public int calcPrice(int price) {
		// TODO Auto-generated method stub
		
		// override �� �޼����� ����θ� ���� Ŭ������ �޼���� �ٸ��� �ϸ� ������ �߻��Ѵ�. 
		
		//return super.calcPrice(price); // ���� Ŭ����(super)�� ������ ȣ���Ѵ�.
		
		bonusPoint += price * bonusRatio;
		return price -= (int)(price * salesRatio); // ���� Ŭ������ calcPrice �޼���� �޸� VIPCustomer Ŭ������ calcPrice�� �������� ������ ������ ��ȯ 
		
	}
	
}
