package chapter14.String;

public class StringEqualsExample {

	public static void main(String[] args) {

		//String은 value값이 같으면 같은 주소를 받는다
		String strVar1 = new String("홍길동");
		String strVar2 = "홍길동";

		//가리키는 주소는 같다
		System.out.println(strVar1.hashCode());
		System.out.println(strVar2.hashCode());
		
		
		if (strVar1 == strVar2) //외부 (메모리가 같은지 비교)
			System.out.println("같은 String 객체를 참조");
		else {
			System.out.println("다른 String 객체를 참조");
		}
		// String은 언박싱이 없음 (auto boxing만 존재함)
		// 따라서 비교를 해주면 주소를 비교하게 됨

		// equals를 사용하요 내부의 값을 비교해준다
		if (strVar1.equals(strVar2))
			System.out.println("같은 String 객체를 참조");
		else {
			System.out.println("다른 String 객체를 참조");
		}

	}
}
