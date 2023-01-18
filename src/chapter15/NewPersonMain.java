package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class NewPersonMain {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Person person1 = new Person();
		System.out.println(person1); // 아무것도 없으면 주소값을 반환 (본래는 toString을 value값을 반환)

		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		Person person2 = (Person) pClass.newInstance(); // 방을 하나더 만들어 주는 메소드
		System.out.println(person2); // 같은 방인데 하나가 더 많드렁짐

		System.out.println("------------------------------");
		// ================================================
		// String 클래스의 정보 가져오기
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass); // String의 주소를 출력해줌 (java.lang.String)
		System.out.println("------------------------------");

		// String 클래스의 생성자들 정보를 출력 (오버라이딩 된 모든 정보)
		Constructor[] cons = strClass.getConstructors(); // getConstructors() => 생성자들 정보를 가지고 온다
		// strClass매게변수에 Sting에 대한 주소가 저장되어 있고 cons매게변수 배열을 생성함
		for (Constructor c : cons)
			System.out.println(c); // String의 생성자를 전부 프린트 해줌

		System.out.println("------------------------------");
		// String 의 메소드 들을 출력
		Method[] method = strClass.getMethods(); // java.lang에서 주는 method를 import해주어야 함
		for (Method m : method) {
			System.out.println(m);

		}
		// =============================================
		String str = "Have,a,Nice,Day";
		// Tokenizer //문자열을 어떤 기준으로 나눌지 판단
		// (1,2,3)
		// 1. 사용할 String 문자역 2. 분리하는 기준 3. 자르는 기준을 표시할건지 여부 (true, flause

		StringTokenizer obj = new StringTokenizer(str, ",", false); // true 공백을 가지고 온다

		while (obj.hasMoreTokens()) { // 띄어쓰기가 없을때 까지 실행
			String t = obj.nextToken(); // 다음 띄어쓰기
			System.out.println(t);

		}

	}

}
