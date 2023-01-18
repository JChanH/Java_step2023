package chapter09;

public class Customer {

	// 맴버변수
	//미리 초기화해줌
	protected double bonusRatio; //1%
	protected String customerGrade;//silver
	
	//assign만 해줌
	protected String customerName; //
	protected int customerID;
	public double bonusPoint;

	public Customer() { //고객등급과 보너스 비율을 stack메모리에 저장해 준다.
		customerGrade = "silver";
		bonusRatio = 0.01; //보너스 비율 1%
	}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "silver";
		bonusRatio = 0.01;
	}
	
	//포인트와 가격
	public int calPrice (int price) { //돈을 지불함과 동시에 보너스 포인트가 쌓인다. 비율은 1%로 고정됨 (bonusPoint = bonusRatio*price)
		bonusPoint += (bonusRatio*price);
		return price; //값을 돌려준다
		
	}
	public String showCustomer() { //bonusPoint를 계산해서 정보를 출력한다
		return customerName + "님의 등급은" + customerGrade + "이며 보너스 포인트는 " + bonusPoint + "원 입니다"; //문자열을 리턴하는 경우에도 print사용하지 않아도 된다.
		
	}
	

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public double getBounsPoint() {
		return bonusPoint;
	}

	public void setBounsPoint(double bounsPoint) {
		this.bonusPoint = bounsPoint;
	}

	public double getBounsRatio() {
		return bonusRatio;
	}

	public void setBounsRatio(double bounsRatio) {
		this.bonusRatio = bounsRatio;
	}

}
