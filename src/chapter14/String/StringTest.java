package chapter14.String;

public class StringTest {

	public static void main(String[] args) {

		String str = "";
		String str1 = "hi everybody";
		String str2 = "have a nice day";

		// 모두 hashcode 주소가 다름
		System.out.println(System.identityHashCode(str)); // 405662939
		System.out.println(System.identityHashCode(str1)); // 123961122
		System.out.println(System.identityHashCode(str2)); // 1227229563

		System.out.println("===========================================");
		str = str1 + str2; // 같은 클라스라서 인쇄가능 (여기서 str의 주소는 새로운 value를 받았음으로 달라진다)
		System.out.println(System.identityHashCode(str)); // 다름
		System.out.println(System.identityHashCode(str1)); // 같음
		System.out.println(System.identityHashCode(str2)); // 같음
		System.out.println("===========================================");

		System.out.println(str); // "hi everybodyhave a nice day" String 값은 합쳐짐
		System.out.println("===========================================");

		// str1의 다른 주소 생성 (concat ==> 문자열을 붙이는 명령어)
		str1 = str1.concat(str2); //문자열을 합치면서 다른 주소값을 할당해줌 (원래 있던값에 새로운 값을 덥어서 쓰여졌기 때문이다)
		System.out.println(System.identityHashCode(str1)); // 주소 바뀜 (1562557367)

		System.out.println("===========================================");
		// str1의 주소가 변하지 않는다 (새로운 곳에 값을 할당해주었기 때문이다)
		str = str1.concat(str2);
		System.out.println(System.identityHashCode(str1)); // 주소 바뀜
		
		// 글자의 길이 나타내기
		System.out.println("str1의 글자수 : " + str1.length()); // 글자의 길이
		System.out.println("str2의 글자수 : " + str2.length()); // 글자의 길이

		//// 원하는 글자의 위치를 반환해줌
		System.out.println("str1 d글자위치" + str1.indexOf('d'));

		/// 전부 대문자, 소분자로 변경해주기
		System.out.println("str1 d글자위치" + str1.toLowerCase());
		System.out.println("str1 d글자위치" + str1.toUpperCase());

	}

}
