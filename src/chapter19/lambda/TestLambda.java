package chapter19.lambda;

interface PrintString {
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
//람다식

		PrintString lambdaStr = s -> System.out.println(s); // 함수명을 변수명으로 대체
		showMyString(lambdaStr);

		// 메소드 안에 람다식 구현부가 있음
		PrintString reStr = returnString();
		reStr.showString("hellow");

	}

	public static void showMyString(PrintString p) { // 매개변수 구현 => p가 body
		p.showString("hellow Lambda"); //인터페이스의 showString의 body를 구현함
	}

	public static PrintString returnString() { // 반환값으로 body 구현
		return s -> System.out.println(s + "world");

	}

}
