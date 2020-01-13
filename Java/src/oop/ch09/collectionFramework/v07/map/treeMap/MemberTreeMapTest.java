package oop.ch09.collectionFramework.v07.map.treeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		// key가 정렬 안된 상태로 데이터 입력
		Member memberPark = new Member(300, "Park");
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark2 = new Member(400, "Park");
		
		
		manager.addMember(memberLee);  
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		// key가 정렬되어 저장된 것 확인 (Key의 자료형인 Integer가 Comparable이 구현되어 있기 때문)
		
		
	}
	
}
