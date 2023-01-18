package chapter12.MultiInterface;

public interface Inter_Menu {

	abstract String jajang(); //interface이기 때문에 abstract는 생략 가능함
	String jjambong();
	
	default void show() {
		System.out.println("맛집");
		
	}
		
}
