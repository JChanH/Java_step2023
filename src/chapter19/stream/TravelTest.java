package chapter19.stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {

	public static void main(String[] args) {
		
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		/*
		customer.add(new TravelCustomer("김찬희", 24,256666));
		customer.add(new TravelCustomer("김찬희", 24,256666));
		customer.add(new TravelCustomer("김찬희", 24,256666));
		*/
		TravelCustomer customerLee = new TravelCustomer("이찬희", 24, 2424);
		TravelCustomer customerKim = new TravelCustomer("김찬희", 24, 2424);
		TravelCustomer customerPark = new TravelCustomer("박찬희", 24, 2424);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerPark);
		//map : 요소들(데이터)를 특정조건에 해당하는 값으로 변환해 줌 
		//map으로 TravelCustomer의 데이터를 가져옴
		customerList.stream().map(c->c.getName()).forEach(s-> System.out.println(s));
		
		//mapToInt : int 형 자료로 변환 
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println(total);
		
		//filter: 특정 조건에 맞는 데이터만 걸러낸다
		System.out.println("20세 이상의 고객의 이름을 정렬하여 출력");
		customerList.stream().filter(c -> c.getAge() >=20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
