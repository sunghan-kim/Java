package oop.ch11.exception.v06.throwsEx;

public class MultiExceptionEx1 {

	/*
	 * 
	 * # ���� ���� ó���ϱ�
	 * 
	 *   - �ϳ��� try{} ��Ͽ��� ���� ���ܰ� �߻��ϴ� ���, catch{} ��� �� ������ ó���ϰų�
	 *     ���� catch{} ������� ������ ó���� �� ����
	 *     
	 *   - ���� �ֻ��� Ŭ������ Exception Ŭ������ ���� ������ ��Ͽ� ��ġ�ؾ� ��
	 *   
	 *     public static void main(String[] args) {
	 *     
	 *     		ThrowsException test = new ThrowsException();
	 *     
	 *     		try {
	 *     
	 *     			test.loadClass("a.txt", "java.lang.String");
	 *     
	 *     		} catch (FileNotFoundException e) {
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		} catch (ClassNotFoundException e) {
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		} catch (Exception e) { // Exception Ŭ������ �� �� ���� ��Ȳ ó��
	 *     
	 *     			e.printStackTrace();
	 *     
	 *     		}
	 *     
	 *     }
	 * 
	 */
	
}
