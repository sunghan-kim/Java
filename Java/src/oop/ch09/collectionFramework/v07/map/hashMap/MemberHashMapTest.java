package oop.ch09.collectionFramework.v07.map.hashMap;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap manager = new MemberHashMap();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		manager.removeMember(200);
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		// 중복된 key 값을 갖는 데이터 추가
		Member memberPark2 = new Member(300, "Park");
		manager.addMember(memberPark2);
		manager.showAllMember();
		
		// 중복된 key 값을 갖는 데이터는 추가되지 않는다. (Integer에 equals()와 hashCode()가 재정의되어 있기 때문)
		
	}
	
}
