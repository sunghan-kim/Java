package oop.ch05.v01.inheritance;

public class VIPCustomer2 extends Customer2{

	/*
	 * 
	 * VIPCustomer Ŭ����
	 * 
	 *   - Customer �� ��ӹ޾� �����ϴ� Ŭ����
	 *   
	 *   - ���
	 *   
	 *     - �ܰ������ ������ �� �پ�����
	 *     - ��ǰ ���� �� 10% ���� (salesRatio)
	 *     - ���ʽ� ����Ʈ 5% ����
	 *     - ��� ���� ����(agentID)
	 *     
	 *   - Customer Ŭ������ ����������, �׺��� �� ���� �Ӽ��� ����� �ʿ� (salesRatio, agentID)
	 * 
	 */
	

	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		//super(); // super() �� ���� Ŭ������ �޸� ��ġ�� ��Ÿ����. ��, ���� Ŭ������ �⺻ �����ڰ� ȣ���
			     // �� super() ��� �ڵ带 ���� �ۼ����� �ʾƵ� pre-compile �ܰ迡�� �ڵ����� �����ȴ�.
		
		// ���� Ŭ������ �⺻ �����ڰ� ���� ��쿡�� super() �� ���� �ҷ��� �� �����Ƿ� �Ʒ��� ���� ���� Ŭ������ �����ڸ� ȣ���ؾ� �Ѵ�.
		//super(0, "");
		
		customerGrade = "VIP"; // ����ϴ� Customer Ŭ������ customerGrade ��� �ɹ������� private ���� �����ڸ� ���� ������ �ٷ� ����� �� ����.
							   // �θ� Ŭ�������� �ܺ� Ŭ���������� ����� �������� �ڽ� Ŭ���������� ����� �����ϵ��� �����ϴ� protected ���� �����ڸ� ����ؾ� �Ѵ�.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
		
	}
	*/
	
	public VIPCustomer2(int customerID, String customerName) { // �⺻ �����ڰ� ���� ���� Ŭ������ �����ڸ� ȣ���� �� �̿� ���� ������� ȣ���� ���� �ִ�.
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
		
	}
	
	
	
}
