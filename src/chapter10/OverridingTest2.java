package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {
	public static void main(String[] args) {
		
		//부모 => 자식(묵시적형변화)
		Customer vc =new VIPCustomer(10003, "김치", 20000); //상속이 되어있는 상태라면 
		
		System.out.println(vc.showCustomer());
		
		//자식 => 부모 (명시적형변환) ?????
		
	}

}
