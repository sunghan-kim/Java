package oop.ch09.collectionFramework.v07.map.treeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {

	private TreeMap<Integer, Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if ( treeMap.containsKey(memberId) ) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println("회원 번호가 없습니다.");
		return false;
		
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = treeMap.keySet().iterator(); // 모든 key 순환
		//Iterator<Member> ir = treeMap.values().iterator(); // 모든 value 순환
		
		while (ir.hasNext()) {
			
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
			
		}
		
		System.out.println();
		
	}
	
}
