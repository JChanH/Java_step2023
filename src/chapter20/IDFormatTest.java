package chapter20;

public class IDFormatTest {

	private String userID;

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	//예외가 생길경우 던져주시
	public void setUser(String userID) throws IDFormatException {
		if (userID == null) {// 아이디가 null인 경 예외처리를 해준다
			throw new IDFormatException("아이디는 null일수 없습니다");

		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8글자 이상 20자 이하로 쓰세요");
		}
		this.userID = userID;
	}

	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		String userID = null;
		try {
			test.setUser(userID);
		} catch (IDFormatException e) {
			System.out.println(e); // 코드와 메세지 출력 (chapter20.IDFormatException: 아이디는 null일수 없습니다)
			System.out.println(e.getMessage()); //메세지만 출력
		}
//------------------------------------------
		//예외문 통과
		String userID2 = "12345678";
		try {
			test.setUser(userID2);
		} catch (IDFormatException e) {
			System.out.println(e); // 코드와 메세지 출력
			System.out.println(e.getMessage()); //메세지만 출력
		}
		
		
	}
}
