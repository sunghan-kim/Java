package oop.ch04.v02.objectArray;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] arr1 = {10, 20, 30, 40, 50}; // 20bytes(5 x 4bytes) �Ҵ� (�⺻ �ڷ��� �迭)
		int[] arr2 = {1, 2, 3, 4, 5}; // 20bytes(5 x 4bytes) �Ҵ� (�⺻ �ڷ��� �迭)
		
		// �迭 ���� : System.arraycopy() �޼��� �̿�
		System.arraycopy(arr1, 0, arr2, 1, 3); // System.arraycopy(� �迭 ��ü�κ���, �� ��° �ε�������, � �迭 ��ü��, �� ��° �ε�������, �� ����)
		
		for (int i=0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
	}
	
}
