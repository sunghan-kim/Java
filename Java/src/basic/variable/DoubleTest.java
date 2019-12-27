package basic.variable;

public class DoubleTest {

	public static void main(String[] args) {
		
		double dNum = 3.14;
		
		// float fNum = 3.14; // error : double이 float형이 될 수 없다. (3.14가 double(더 큰수)로 저장되어 있다.)
		
		float fNum = 3.14f; // f 를 사용하면 float 으로 저장하라고 지정할 수 있다.
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		// 보통 float 보다 double을 더 많이 사용한다.
		
	}
	
}
