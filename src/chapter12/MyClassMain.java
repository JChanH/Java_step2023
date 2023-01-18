package chapter12;

public class MyClassMain {
	public static void main(String[] args) {

	//x,y MyInterface 클래스 타입의 변수의 인스턴스 변수를 선언하여 출력
		MyClass mclass = new MyClass(); //매게변수 만들어줌
		//출력
		
		X xclass= mclass; // 인스턴스 변수
		xclass.x();
		
		Y yclass= mclass;
		yclass.y();
		
		MyInterface iclass = mclass;
		iclass.myMethod();
		iclass.x();
		iclass.y();
		
		
		
	}
}
