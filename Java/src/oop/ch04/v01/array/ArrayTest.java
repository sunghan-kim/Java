package oop.ch04.v01.array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		int[] arr2 = new int[] {1,2,3}; // �ʱ�ȭ�� ���� ������ ���ȣ �ȿ� �迭�� ũ�⸦ ���� �������� �ʴ´�.
		
		int[] arr3 = {1,2,3}; // ����� "���ÿ�" �ʱ�ȭ�� �ϸ� new �� ������ �� �ִ�.
		
		/*
		 * 
		 * �迭�� 1���� 10������ �����͸� �ְ� �հ� ���ϱ�
		 * 
		 */
		
		int[] arr4 = new int[10];
		int total = 0;
		
		for (int i=0; i < arr4.length; i++) {
			
			System.out.println(arr4[i]); // 0���� �ʱ�ȭ�Ǿ� ����(int �ڷ������� �����߱� ����)
			
		}
		
		System.out.println();
		
		for (int i=0, num=1; i < arr4.length; i++, num++) {
			
			arr[i] = num;
			
		}
		
		for (int i=0; i < arr4.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		for (int i=0; i < arr4.length; i++) {
			total += arr[i];
			System.out.println(total);
		}
		
		System.out.println("total : " + total);
		
		System.out.println();
		
		/*
		 * 
		 * ������ ��
		 * 
		 *   
		 * 
		 */
		
		double[] dArr = new double[5];
		
		dArr[0] = 1.1;
		dArr[1] = 2.1;
		dArr[2] = 3.1;
		
		double mtotal = 1;
		for (int i=0; i < dArr.length; i++) {
			
			mtotal *= dArr[i];
			
		}
		
		System.out.println(mtotal); // dArr�� �ε��� 3,4�� �ش��ϴ� ���� �������� �ʾ� 0.0���� �ʱ�ȭ�Ǿ� �־� ��ü ���� 0�� ��µȴ�.
									// -> count ������ ���
		
		System.out.println( );
		
		int count = 0;
		
		double[] dArr2 = new double[5];
		
		dArr2[0] = 1.1; count++;
		dArr2[1] = 2.1; count++;
		dArr2[2] = 3.1; count++;
		
		double mtotal2 = 1;
		for (int i=0; i < count; i++) {
			
			mtotal2 *= dArr2[i];
			
		}
		
		System.out.println(mtotal2);
		
		
	}
	
}
