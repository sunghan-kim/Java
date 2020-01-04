 package oop.ch05.v02.inheritanceCasting;

public class Customer {

	/*
	 * 
	 * Customer Ŭ����
	 * 
	 *   �ɹ� ����
	 *   
	 *     - customerID
	 *     
	 *       - �� ���̵�
	 *       
	 *     - customerName 
	 *       
	 *       - �� �̸�
	 *       
	 *     - customerGrade
	 *     
	 *       - �� ���
	 *       - �⺻ �����ڿ��� �����Ǵ� �⺻ ����� SILVER �̴�.
	 *       
	 *     - bonusPoint
	 *     
	 *       - ���� ���ʽ� ����Ʈ
	 *       - ���� ��ǰ�� ������ ��� �����Ǵ� ���ʽ� ����Ʈ
	 *       
	 *     - bonusRatio
	 *     
	 *       - ���ʽ� ����Ʈ ���� ����
	 *       - ���� ��ǰ�� ������ �� ���� �ݾ��� ���� ������ ���ʽ� ����Ʈ�� ������
	 *       - �� �� ���Ǵ� ���� ����
	 *       - �⺻ �����ڿ��� �����Ǵ� ���� ���� = 1% (��, 10,000��¥���� ��� 100���� ������)
	 *       
	 * 
	 */
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	/*
	public Customer() {
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer() ������ ȣ��"); // ���� Ŭ������ �ν��Ͻ��� �������� �ʰ� ���� Ŭ������ �ν��Ͻ��� �������� ��
													  // ���� Ŭ������ �����ڰ� ȣ��Ǵ� �� Ȯ���ϱ� ���� �α�
		
		
	}
	*/
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, String) ������ ȣ��");
		
	}
	
	// calcPrice() : ���� ��� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio; // ���ʽ� ����Ʈ ����
		return price;
	}
	
	// showCustomerInfo() : �� ���� ���
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ������ ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.";
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
