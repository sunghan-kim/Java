package oop.ch09.collectionFramework.v06.set.treeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet2 {

	private TreeSet<Member2> treeSet;
	
	public MemberTreeSet2() {
		treeSet = new TreeSet<Member2>(new Member2());
	}
	
	public void addMember(Member2 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member2> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member2 member = ir.next();
			
			if (member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberId + "번호가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		
		for (Member2 member : treeSet) {
			System.out.println(member.toString());
		}
		
	}
	
}
