package chapter13;

public class StaticInner {
	int a = 10;
	private int b = 100;
	static int c = 100;

	// 생성자

	// 메소드

	// 내부 클래스
	static class Inner { //일종에 메서드 역할을 함
		// 필드
		static int d = 1000; // Inner에서는 static이기 때문에 사용 가능하다
		
		// 생성자
		// 메소드
		public void printData() { //a와 b는 저장공간이 달라서 사용 불가능(static이 아님)
			//System.out.println("int a :" + a);
			//System.out.println("private b :" + b);
			System.out.println("static c :" + c);
			System.out.println(d);
		}

	}

	public static void main(String[] args) {
	Inner inner = new Inner();
	inner.printData();
	
	}

}
