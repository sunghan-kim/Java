package oop.ch08.javaBasicClass.v08.queue;

import java.util.ArrayList;

class MyQueue {
	
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enqueue(String data) {
		arrayQueue.add(data);
	}
	
	public String dequeue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		return arrayQueue.remove(0);
		
	}
	
}

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enqueue("A");
		queue.enqueue("B");
		queue.enqueue("C");
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
		// Queue�� �������̽��� �����Ǿ� �ִ�. �� Queue �������̽��� �̿��� ������ Ŭ������(LinkedList ��)�� �����Ѵ�.
		
	}
	
}
