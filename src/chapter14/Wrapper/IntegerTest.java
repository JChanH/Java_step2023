package chapter14.Wrapper;

//Wrapper
public class IntegerTest {

	public static void main(String[] args) {

		// Integer i = new Integer(100); //곧 없어질 것 (int i = 100;)

		Integer num = 100; // 일반 자료 => 클래스로 선언함 (오토박싱)

		int iNum = num.intValue(); // intValue() 해당 매게에 클래스에 들어있는 값
		// 클래스 타입 => 일반 자료(언박식)

		int jNum = 200;

		// 자동 언박싱
		int sum = iNum + jNum;
		System.out.println(sum);

		// 오토박싱 (int => Integer)
		Integer i = jNum;
		System.out.println(i); // Integer.valueOf(jNum)로 변환하는 것과 같음

	}

}
