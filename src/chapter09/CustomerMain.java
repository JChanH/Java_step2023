package chapter09;

public class CustomerMain {

	public static void main(String[] args) {

		// vip고객
		System.out.println("------VIP고객--------");
		int price = 10000;
		VIPCustomer vip = new VIPCustomer(1004, "홍길동", 900);

		int vipprice = vip.calPrice(price);
		System.out.println(vip.getCustomerName() + "님이" + vipprice + "원을 지불하셨습니다.");
		System.out.println(vip.showCustomer());

		System.out.println("-------------일반고객----------------");
		price = 10000;
		Customer normal = new Customer(1005, "장길산");
		
		int normalPrice = normal.calPrice(price); //normal로 불러온 calPrice메소드에 price를 넣고 결과값을 normalPrice에 저장한다
		System.out.println(normal.getCustomerName() + "님이" + normalPrice + "원을 지불하셨습니다.");
		System.out.println(normal.showCustomer());
		
		
		
		
	}
}
