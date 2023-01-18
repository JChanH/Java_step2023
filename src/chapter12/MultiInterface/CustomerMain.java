package chapter12.MultiInterface;

public class CustomerMain {
	public static void main(String[] args) {
		Customer customer = new Customer();
		System.out.println("----------buy----------");
		Buy buy = customer; //뼈대에 대한 구현부를 만들어 준다 (본래 interface를 매게변수로 못 가져온다)
		buy.buy(); //Buy에는 구현되어 있지 않음으로 overriding된 Customer에서 구현된 buy를 실행
		buy.order(); //
		
		System.out.println("----------sell----------");
		Sell sell =  customer;
		sell.sell(); //Customer의 sell을 실행 
		sell.sellorder();
		sell.order(); //현재 order는 customer에서 중복으로 쓰이고 있음 
		//Customer는 내부에서 buy에서 끌어다가 쓸지 or sell에서 끌어다가 쓸지 정할 수 있다.
		System.out.println();
		
		
		//sell 부모 / customer 자식
		if(sell instanceof Customer) { //객체가 어떤 클래스인지, 어떤 클래스를 상속받았는지 확인하는데 사용하는 연산자입니다.
			//만약 sell이 부모이고 customer가 자식이면 
			Customer customer2 = (Customer)sell; //명시적 형변환 해주어야 함 
			System.out.println("Down Casting");
			customer2.buy();
			customer2.sell();
			customer2.sellorder(); 
			customer2.order();//buy내부의 order를 출력한다
		}
		customer.order(); //
		//customer
	}
} 
