package oop.ch07.question.q1;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascendinig");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descendinig");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("HeapSort 알고리즘입니다.");
	}
	
}
