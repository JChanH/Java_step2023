package chapter09;

public class C extends A { // A를 상속받음

	public C() {
		super(); // 부모클래스의 생성자 컴파일
		this.field = "value"; // A내부의 field에 저장
		this.method();// 자신의 method를 실행

	}

	public static void main(String[] args) {
		C c = new C(); // 자식 (실행)
		c.method(); // 부모

	}

}
