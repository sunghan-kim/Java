package oop.ch04.v01.array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		int[] arr2 = new int[] {1,2,3}; // 초기화를 해줄 때에는 대괄호 안에 배열의 크기를 따로 지정하지 않는다.
		
		int[] arr3 = {1,2,3}; // 선언과 "동시에" 초기화를 하면 new 를 생략할 수 있다.
		
		/*
		 * 
		 * 배열에 1부터 10까지의 데이터를 넣고 합계 구하기
		 * 
		 */
		
		int[] arr4 = new int[10];
		int total = 0;
		
		for (int i=0; i < arr4.length; i++) {
			
			System.out.println(arr4[i]); // 0으로 초기화되어 있음(int 자료형으로 선언했기 때문)
			
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
		 * 주의할 점
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
		
		System.out.println(mtotal); // dArr에 인덱스 3,4에 해당하는 값을 지정하지 않아 0.0으로 초기화되어 있어 전체 곱이 0이 출력된다.
									// -> count 변수를 사용
		
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
