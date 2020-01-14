package oop.ch10.v03.stream;

public class ReduceEx1 {

	/*
	 * 
	 *   reduce() 연산
	 *   
	 *     - 정의된 연산이 아닌 프로그래머가 직접 지정하는 연산을 적용
	 *     
	 *     - 최종 연산으로 스트림의 요소를 소모하며 연산 수행
	 *     
	 *     ex) 배열의 모든 요소의 합을 구하는 reduce() 연산
	 *     
	 *       Arrays.stream(arr).reduce(0, (a,b) -> a + b));
	 *       
	 *         - 0 : 초깃값 
	 *         - (a,b) : 전달되는 요소
	 *         - (a,b) -> a + b : 각 요소가 수행해야 할 기능
	 *         
	 *     - 두 번째 요소로 전달되는 람다식에 따라 다양한 기능을 수행
	 * 
	 */
	
}
