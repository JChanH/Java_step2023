package chapter12.MultiInterface;

public interface Sell {

	void sell();
	
	default void order() {//같은 이름의 경우에는 오버라이딩 해야함
		System.out.println("판매주문하기");
		
	}
	
	default void sellorder() { //default = 동일한 패키지 내에서만 접근이 가능함(같은 패키지 내에서 2개가 존재불가능
		System.out.println("판매주문하기");
	}
	
}
