package oop.ch08.javaBasicClass.v07.stack;

import java.util.ArrayList;
import java.util.Stack;

class MyStack {
	
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if (len == 0) {
			System.out.println("������ ������ϴ�.");
			return null;
		}
		return arrayStack.remove(len-1);
	}
	
	
}

public class StackTest {
 
	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		System.out.println("========================");
		
		// �ڹٿ��� Stack�� �̹� �����Ǿ� �ִ�.
		Stack<String> stack2 = new Stack<String>();  
		
		stack2.push("A");
		stack2.push("B");
		stack2.push("C");
		
		System.out.println(stack2.peek()); // peak() : �����͸� �������� �ʰ� Ȯ�θ� �� 
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		
		
	}
	
}
