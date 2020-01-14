package oop.ch11.exception.v05.tryWithResources;

public class TryWithResourcesEx1 {

	/*
	 * 
	 * # try - with - resources ��
	 * 
	 *   - ���ҽ��� �ڵ����� ���� �ϵ��� �������ִ� ����
	 *   
	 *   - �ش� ���ҽ��� AutoCloseable�� ������ ���, close() �� ��������� ȣ������ �ʾƵ� try{} ��Ͽ��� ���µ� ���ҽ���
	 *     �������� ��쳪 ���ܰ� �߻��� ��� ��� �ڵ����� close()�� ȣ���
	 *     
	 *   - java 7 ���� ������
	 *   
	 *   - FileInputStream �� ��� AutoCloseable�� �����ϰ� ����
	 *   
	 *   - ����
	 *   
	 *     try (�����߻��� ����Ǵ� ����) {
	 *     
	 *     } catch () {
	 *     
	 *     } catch () {
	 *     
	 *     }
	 *   
	 * 
	 * # AutoCloseable �������̽� ����ϱ�
	 * 
	 *   - AutoCloseable �������̽��� ������ Ŭ������ �����, close()�� �� ȣ��Ǵ� �� Ȯ��
	 *   
	 *     public class AutoCloseObj implements AutoCloseable {
	 *     
	 *     		#Override
	 *     		public void close() throws Exception { // close() �޼��� ����
	 *     
	 *     			System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	 *     
	 *     		}
	 *     
	 *     }
	 * 
	 * 
	 */
	
}
