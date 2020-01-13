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
		
		// �ߺ��� key ���� ���� ������ �߰�
		Member memberPark2 = new Member(300, "Park");
		manager.addMember(memberPark2);
		manager.showAllMember();
		
		// �ߺ��� key ���� ���� �����ʹ� �߰����� �ʴ´�. (Integer�� equals()�� hashCode()�� �����ǵǾ� �ֱ� ����)
		
	}
	
}
