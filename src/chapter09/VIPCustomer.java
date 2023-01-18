package chapter09;

public class VIPCustomer extends Customer {

	private int agentID;
	double salesRatio;

	public VIPCustomer(int customerID, String customeraName, int agentID) {
		super(customerID, customeraName); //Customer클라스에 변수방에 저장해준다
		// this.customerID= customerID;
		// this.customerName= customerName;
		customerGrade = "VIP"; //초기화
		bonusRatio = 0.05;//보너스 비율
		this.agentID = agentID;
		salesRatio = 0.1; //판매원이 받는 비율

	}
	//포인트 정립 
	@Override
	public int calPrice(int price) { //돈을 넣어주고 
		bonusPoint = (price-(int)(price*salesRatio))*bonusRatio; //전문상담원의 비용
		return price-(int)(price*salesRatio);//원래 가격에서 할인됨
	
	}

	@Override
	public String showCustomer() {
		
		return super.showCustomer() + "\n 전문상담원은" + agentID +"입니다";  //Customer에서 override된 메소드이다.(Customer내부의 showCustomer의 리턴값에 + 하여 연속으로 넣어서 출력이 가능하다 
	}

	public int getAgentID() {
		return agentID;
	}

}
