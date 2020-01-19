package oop.ch13.thread.v02.threadUsefulMethod;

public class JoinTest2 extends Thread {
	
	int start;
	int end;
	int total;
	
	public JoinTest2(int start, int end) {
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
		
		JoinTest2 jt1 = new JoinTest2(1, 50);
		JoinTest2 jt2 = new JoinTest2(51, 100);
		
		// 2���� thread ���� ����
		jt1.start();
		jt2.start();
		
		try {
			// main thread�� jt1, jt2�� join �ϱ�
			jt1.join();
			jt2.join(); 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int total = jt1.total + jt2.total;
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		System.out.println(total); // 5050�� ��µȴ�.
		
	}
	
}
