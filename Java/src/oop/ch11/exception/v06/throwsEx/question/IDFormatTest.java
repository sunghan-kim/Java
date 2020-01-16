package oop.ch11.exception.v06.throwsEx.question;

public class IDFormatTest {

	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IDFormatException { // IDFormatException�� ����ϴ� �ʿ��� ó���ϵ��� �ѱ��(throws)
		
		if (userId == null) {
			
			throw new IDFormatException("���̵�� null �� �� �����ϴ�."); // throw Ű���带 ����Ͽ� ���ܸ� �߻���Ų��.
			
		} else if (userId.length() < 8 || userId.length() > 20) {
			
			throw new IDFormatException("���̵�� 8�� �̻�, 20�� ���Ϸ� ������.");
			
		}
		
		this.userId = userId;
		
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		//String myId = null; // (�߻�) oop.ch11.exception.v06.throwsEx.question.IDFormatException: ���̵�� null �� �� �����ϴ�. 
		//String myId = "abcde"; // (�߻�) oop.ch11.exception.v06.throwsEx.question.IDFormatException: ���̵�� 8�� �̻�, 20�� ���Ϸ� ������. 
		String myId = "abcdefghijk"; // ���� ���� �� end ���
		
		try {
			
			idTest.setUserId(myId); // setUserId �޼��忡�� throw �� ���ܰ� �����Ƿ�, ���⼭ ���ܸ� ó������� �Ѵ�.
			
		} catch (IDFormatException e) {
			
			System.out.println(e);
			
		} 
		
		System.out.println("end");
		 
	}
	
}
