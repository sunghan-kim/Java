package oop.ch09.collectionFramework.v06.set.hashSet;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet manager = new MemberHashSet();
		
		Member memberLee = new Member(100, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(300, "Park");
		
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		manager.removeMember(100);
		
		manager.showAllMember();
		
		System.out.println("=============================");
		
		Member memberPark2 = new Member(300, "Park2");
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		/*
		 * 
		 *   memberId�� 300���� �ߺ��Ǵ� Park2�� �߰��� ����
		 *   
		 *     - memberPark �� memberPark2�� ���ٴ� ���� ���ǵ��� �ʾұ� ���� 
		 *     
		 *     - Member Ŭ�������� memberId �� ������ �Ȱ��� Member �ٴ� ���� �����ؾ� �Ѵ�.
		 *     
		 *     - Object�� equals() �� hashCode() ������
		 * 
		 */
		
		// Member Ŭ�������� equals() �� hashCode() �������� �� Park2 �� �߰����� �ʴ� �� Ȯ��
		
	}
	
}
