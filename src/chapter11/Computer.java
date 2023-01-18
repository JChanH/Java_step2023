package chapter11;

//단 하나라도 추상 메소드가 존재하면 반드시 abstract를 추가한다
//추상 클래스
public abstract class Computer {

	// 추상 메서드 (body가 없다) // body는 수행부 //abstract를 붙여주어야 한다
	public abstract void display(); //하위 클래스에서 구현해서 사용하라는 의미
	public abstract void typing();


	// 일반메소드
	public void turnon() {
		System.out.println("켭니다");

	}

	public void turnoff() {
		System.out.println("끕니다");

	}

}
