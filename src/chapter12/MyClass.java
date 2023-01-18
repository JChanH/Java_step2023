package chapter12;

public class MyClass implements MyInterface { //여러개의 설계도를 하나로 묶어서 가지고 와서 Class에 메소드구현함)

	@Override
	public void x() {
		System.out.println("x()");
	}
//==========================================================
	@Override
	public void y() {
		System.out.println("y()");
			
	}
//=============================================================
	@Override
	public void myMethod() {
		System.out.println("myMethod");
		
	}

}
