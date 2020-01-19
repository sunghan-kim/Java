package oop.ch13.thread.v02.threadUsefulMethod;

public class JoinTest1 extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest1(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
		int i;
		
		for (i=start; i<=end; i++) {
			total += i;
		}
		
	}

	public static void main(String[] args) {
		
		JoinTest1 jt1 = new JoinTest1(1, 50);
		JoinTest1 jt2 = new JoinTest1(51, 100);
		
		// 2개의 thread 동시 실행
		jt1.start();
		jt2.start();
		
		int total = jt1.total + jt2.total;
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println(total); // 5050이 출력되지 않는다.
		
	}
	
}
