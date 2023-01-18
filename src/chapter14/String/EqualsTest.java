package chapter14.String;

public class EqualsTest {

	public static void main(String[] args) {

		// String 클래스는 이미 메서드가 toString되어 있다(재정의 되어있다)
		String str1 = new String("test"); //저장되어 있는 공간을 다르지만 stack에 저장된 주소는 같다
		String str2 = new String("test");

		Student studentLee = new Student(100, "이상우");
		Student studentLee2 = studentLee; // 주소를 같게 해준다 (value값도 같게 가지고 온다)
		Student studentSang = new Student(100, "이상우");

		// 동일한 주소의 주 인스턴스 비교(물리적 값이 동일함)
		System.out.println("---------동일한 주소의 두 인스턴스 비교----------------");
		if (studentLee == studentLee2) {
			System.out.println("studentLee와 StudentLee2의 주소는 같습니다");
		} else
			System.out.println("다릅니다.");
		if (studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 StudentLee2는 value값이 같습니다");
		} else
			System.out.println("다릅니다.");

		// 물리적 주소는 다르지만 논리적 값이 동일
		System.out.println("---------물리적 주소(==)는 다르지만 논지적 값이 동일(equals)----------------");
		if (studentLee == studentSang) { // 저장된 주소는 다르지만
			System.out.println("studentLee와 StudentLee2의 주소는 같습니다");
		} else
			System.out.println("다릅니다.");
		if (studentLee.equals(studentSang)) { // 안쪽의 내용물은 같다
			System.out.println("studentLee와 StudentLee2는 value값이 같습니다");
		} else
			System.out.println("다릅니다.");

		System.out.println();
		System.out.println("------------데이터 값 출력---------------");
		System.out.println("studentLee의 hashcode : " + studentLee.hashCode()); // hashcode 값은 같도록 설정하였다 (hash
		System.out.println("studentSang의 hashcode : " + studentSang.hashCode());

		System.out.println();
		System.out.println("------------데이터 값은 같으나 hash값이 다르므로 재정의가 필요---------------");
		System.out.println("studentLee의 실제 주소값 : " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값 : " + System.identityHashCode(studentSang));

		// HashCode 재정의가 되어 있음 //
		System.out.println("---------String클래스의 실제값 출력-------------");
		System.out.println("str1의 hashcode : " + str1.hashCode());
		System.out.println("str2의 hashcode : " + str2.hashCode());

	}

}
