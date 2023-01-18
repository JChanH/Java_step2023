package chapter09;

public class B {

	// 같은 패키지
	public void method() {
		A a = new A();
		a.field = "value"; //A에 value를 저장함
		a.method();
	}

	public static void main(String[] args) {
		B b = new B();
		b.method();
	}
}
