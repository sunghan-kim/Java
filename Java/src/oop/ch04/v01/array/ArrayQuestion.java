package oop.ch04.v01.array;

public class ArrayQuestion {

	/*
	 * 
	 * �迭 ����
	 * 
	 *   - ���� �迭�� �����ϰ� ���
	 *   - �빮�ڸ� A-Z���� �迭�� �����ϰ� �̸� �ٽ� ����ϴ� ���α׷� �ۼ�
	 * 
	 */
	
	public static void main(String[] args) {
		
		char[] alphabets = new char[26];
		
		char ch = 'A';
		
		for (int i=0; i < alphabets.length; i++) {
			
			// ���ڵ� ������ ǥ�� ���� (A�� 1�� ���� B�� ���� �� �ִ�.)
			alphabets[i] = ch++; // ch�� �Ҵ��� ���� 1�� ���Ѵ�.
			
		}
		
		for (int i=0; i < alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i]);
		}
		
	}
	
}
