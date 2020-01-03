package oop.ch04.v03.multiDimArray;

public class TwoDimension {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		System.out.println(arr.length); // 행 개수
		
		System.out.println(arr[0].length); // 열 개수
		
		System.out.println("===============================");
		
		for (int i=0; i < arr.length; i++) {
			for (int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
