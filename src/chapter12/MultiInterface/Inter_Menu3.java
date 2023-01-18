package chapter12.MultiInterface;

public interface Inter_Menu3 extends Inter_Menu, Inter_Menu2 { 
	// 인터페이스에서는 다중 상속 가능하다 
	//단 Inter_Menu, Inter_Menu2에 같은 이름의 메소드를 override한 경우에는 어느것을 사용할지 명시해 주어야 함

	abstract String bokgumbab();

}
