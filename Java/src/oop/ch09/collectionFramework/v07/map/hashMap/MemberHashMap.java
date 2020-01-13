package oop.ch09.collectionFramework.v07.map.hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		
		if ( hashMap.containsKey(memberId) ) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
		
	}
	
	public void showAllMember() {
		
		Iterator<Integer> ir = hashMap.keySet().iterator(); // ��� key ��ȯ
		//Iterator<Member> ir = hashMap.values().iterator(); // ��� value ��ȯ
		
		while (ir.hasNext()) {
			
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
			
		}
		
		System.out.println();
		
	}
	
}
