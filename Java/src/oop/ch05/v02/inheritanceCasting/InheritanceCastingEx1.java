package oop.ch05.v02.inheritanceCasting;

public class InheritanceCastingEx1 {

	/*
	 * 
	 * Ex1. ��ӿ��� Ŭ���� ���� �������� �� ��ȯ
	 * 
	 *   1.1 ���� Ŭ������ �����Ǵ� ����
	 *   
	 *     - ���� Ŭ������ ������ �� ���� Ŭ������ ���� ���� ��
	 *     
	 *     - ���� Ŭ������ �����ڰ� ȣ��ǰ� ���� Ŭ������ �����ڰ� ȣ���
	 *     - ���� Ŭ������ �����ڿ����� ������ ���� Ŭ������ �����ڰ� ȣ��Ǿ�� ��
	 *     
	 *     - ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ���ϴ� �ڵ尡 ���� ��� �����Ϸ��� ���� Ŭ���� �⺻ �����ڸ�
	 *       ȣ���ϱ� ���� super() �� �߰���
	 *       
	 *     - super() �� ȣ��Ǵ� �����ڴ� ���� Ŭ������ �⺻ ��������
	 *     
	 *     - ���� ���� Ŭ������ �⺻ �����ڰ� ���� ���(�Ű������� �ִ� �����ڸ� �����ϴ� ���)
	 *       ���� Ŭ������ ���������� ���� Ŭ������ �����ڸ� ȣ���ؾ� ��
	 *       
	 *       
	 *   1.2 ��ӿ����� �޸� ����
	 *   
	 *     - ���� Ŭ������ �ν��Ͻ��� ���� ������
	 *     
	 *       - Customer() ������ ȣ��
	 *         -> Customer Ŭ������ �ɹ� ������ �� �޸𸮿� ������
 	 *       
	 *     - ���� Ŭ������ �ν��Ͻ��� ���� ��
	 *     
	 *       - VIPCustomer() ������ ȣ��
	 *         -> VIPCustomer Ŭ������ �ɹ� ������ �� �޸𸮿� ������
	 *         
	 *         
	 *   1.3 ���� Ŭ�������� ������ �� ��ȯ (��ĳ����)
	 *   
	 *     - ���� Ŭ���� ������ ������ �����ϰ� ���� Ŭ���� �ν��Ͻ��� ������ �� ����
	 *     - ���� Ŭ������ ���� Ŭ������ Ÿ���� �����ϰ� �����Ƿ� ���� Ŭ������ ������ ����ȯ�� ������
	 *     - ��� ���迡�� ��� ���� Ŭ������ ���� Ŭ������ ������ ����ȯ�� ��
	 *     - �� ���� �������� ����
	 *     
	 *       Customer vc = new VIPCustomer();
	 *       
	 *          ^					^
	 *          |					|
	 *          
	 *      ����� Ŭ������		������ �ν��Ͻ��� Ŭ������
	 *      (���� Ŭ������)		(���� Ŭ������)
	 * 
	 * 
	 *   1.4 �� ��ȯ������ �޸�
	 *   
	 *     Customer vc = new VIPCustomer(); ���� vc �� ����Ű�� ����?
	 *     
	 *       - VIPCustomer() �������� ȣ��� �ν��Ͻ��� ��� ���� �Ǿ�����
	 *         Ÿ���� Customer �̹Ƿ� ������ �� �ִ� ������ �޼���� Customer�� ������ �޼���� ���ѵȴ�.
	 *         
	 *         
	 *   1.5 Ŭ���� ���� ������ ���� �ܰ��� ���
	 *   
	 *     				������(Mammal)
	 *     					  ^
	 *     					  |
	 *     	    -----------------------------
	 *     		|							|
	 *     ȣ����(Tiger)			�����(Primate)
	 *     									^
	 *     									|
	 *     								�ΰ�(Human)
	 *     
	 *       - Human�� ���������� Primate�� Mammal�� �ڷ����� ��� �����ϰ� ����
	 *       
	 *         Primate aHuman = new Human();
	 *         Mammal mHuman = new Human();
	 *     
	 *         
	 * 
	 */
	
}