package chapter12.MultiInterface;

public class Customer implements Buy, Sell {

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

//같은 메서드명이 존재하면 오버라이딩 필수
	@Override
	public void order() {
		// System.out.println("고객 판매");
		Buy.super.order(); // 오더를 끌어쓰는 경우에 buy의 정보를 끌어쓸지 sell을 끌어쓸지 정함 //Sell.super.order();
	}
}
