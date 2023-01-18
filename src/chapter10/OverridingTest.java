package chapter10;

import chapter09.Customer; //protected된 데이터를 다른 패키지에서 불러옴
import chapter09.VIPCustomer;

public class OverridingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerLee = new Customer(10001, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomer());
		
		VIPCustomer customerKim = new VIPCustomer(10002, "김유신", 1004);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomer());
		
		System.out.println(customerLee.getCustomerName() + "님이 " + customerLee.calPrice(10000) + "원을 지불 완료하였습니다.");
		System.out.println(customerKim.getCustomerName() + "님이 " + customerKim.calPrice(10000) + "원을 지불 완료하였습니다.");
		
		
		
	}

}
