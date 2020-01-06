package oop.ch07.question.q1;

public class QuickSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascendinig");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("QuickSort descendinig");
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("QuickSort 알고리즘입니다.");
	}
	
	

}
