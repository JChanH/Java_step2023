package chapter14.String;

public class StringEquals {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");

		System.out.println(str1 == str2); // 같은 메모리 공간을 사용하고 있는지 판단 // false
		System.out.println(str1.equals(str2)); // 내부의 값이 같은지 비교해줘

		System.out.println("--------------------------------------");
		// 상수폴
		String str = "abc";
		String str3 = "abc";

		System.out.println(str == str3); // 같은 String Pool을 사용하고 있기 때문에 true반환

		System.out.println("--------------------------------------");
		// Boxing : 기본 타입값을 포장해서 객체로 만듬

		// Integer은 value 값이 주소값으로 return되도록 고정되어 있음
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		Integer i3 = 100;
		Integer i4 = 100;

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		System.out.println("-----------------------------------------");

		System.out.println(i1 == i2); // 같은 메모리에 있는지 확인 false 
		System.out.println(i3 == i4); // 같은 메모리에 있는지 확인 true
		System.out.println(i1.equals(i2));
	}

}
