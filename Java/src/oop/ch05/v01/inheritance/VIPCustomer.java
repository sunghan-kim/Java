package oop.ch05.v01.inheritance;

public class VIPCustomer extends Customer{

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
	
	public VIPCustomer() {
		
		customerGrade = "VIP"; // ����ϴ� Customer Ŭ������ customerGrade ��� �ɹ������� private ���� �����ڸ� ���� ������ �ٷ� ����� �� ����.
							   // �θ� Ŭ�������� �ܺ� Ŭ���������� ����� �������� �ڽ� Ŭ���������� ����� �����ϵ��� �����ϴ� protected ���� �����ڸ� ����ؾ� �Ѵ�.
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
	}
	
}
