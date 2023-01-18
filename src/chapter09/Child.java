package chapter09;

public class Child extends Parent{

	@Override //매게변수도 같게하고 메소드를 다르게 하는것이고 상속시 사용한다 (통일성, 다형성을 위해서)
	public void method2() {//같은 이름의 매게변수로 2개 존재하고 있는 상태
		System.out.println("child method2");
	}
	
	public void method3() {//같은 이름의 매게변수로 2개 존재하고 있는 상태
		System.out.println("child method3");
	}
	
	
	

}
