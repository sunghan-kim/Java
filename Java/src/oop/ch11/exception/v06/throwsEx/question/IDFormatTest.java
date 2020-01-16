package oop.ch11.exception.v06.throwsEx.question;

public class IDFormatTest {

	private String userId;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) throws IDFormatException { // IDFormatException를 사용하는 쪽에서 처리하도록 넘기기(throws)
		
		if (userId == null) {
			
			throw new IDFormatException("아이디는 null 일 수 없습니다."); // throw 키워드를 사용하여 예외를 발생시킨다.
			
		} else if (userId.length() < 8 || userId.length() > 20) {
			
			throw new IDFormatException("아이디는 8자 이상, 20자 이하로 쓰세요.");
			
		}
		
		this.userId = userId;
		
	}

	public static void main(String[] args) {
		
		IDFormatTest idTest = new IDFormatTest();
		
		//String myId = null; // (발생) oop.ch11.exception.v06.throwsEx.question.IDFormatException: 아이디는 null 일 수 없습니다. 
		//String myId = "abcde"; // (발생) oop.ch11.exception.v06.throwsEx.question.IDFormatException: 아이디는 8자 이상, 20자 이하로 쓰세요. 
		String myId = "abcdefghijk"; // 정상 동작 후 end 출력
		
		try {
			
			idTest.setUserId(myId); // setUserId 메서드에서 throw 된 예외가 있으므로, 여기서 예외를 처리해줘야 한다.
			
		} catch (IDFormatException e) {
			
			System.out.println(e);
			
		} 
		
		System.out.println("end");
		 
	}
	
}
