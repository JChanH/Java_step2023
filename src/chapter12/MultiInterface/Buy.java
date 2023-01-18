package chapter12.MultiInterface;

public interface Buy {

	void buy(); //Customer에 구현된
	
	default void order() {
		System.out.println("구매 주문");
	}
	
	
	
}
