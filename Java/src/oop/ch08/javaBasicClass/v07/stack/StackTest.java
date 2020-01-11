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
			System.out.println("스택이 비었습니다.");
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
		
		// 자바에는 Stack이 이미 구현되어 있다.
		Stack<String> stack2 = new Stack<String>();  
		
		stack2.push("A");
		stack2.push("B");
		stack2.push("C");
		
		System.out.println(stack2.peek()); // peak() : 데이터를 삭제하진 않고 확인만 함 
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		
		
	}
	
}
