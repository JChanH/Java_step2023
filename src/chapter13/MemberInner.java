package chapter13;

public class MemberInner {
	int a = 10;
	private int b = 100;
	static int c = 100;

	// 생성자

	// 메소드

	// 내부 클래스
	class Inner { // 클래스의 특적을 가지고 있는 메소드
		// 필드
		// 생성자
		// 메소드
		public void printData() {
			System.out.println("int a :" + a);
			System.out.println("private b :" + b);
			System.out.println("static c :" + c);

		}

	}

	public static void main(String[] args) {
	MemberInner outer = new MemberInner(); //우선 MemberInner자리를 할당해 주고 
	MemberInner.Inner inner = outer.new Inner(); // inner자리를 만들어 주기 + 메개변수(주소)설정해주기
	
	//동일함
	MemberInner.Inner inner2 = new MemberInner().new Inner(); //연속으로 자리를 지정해주고 
	
	
	
	}

}
