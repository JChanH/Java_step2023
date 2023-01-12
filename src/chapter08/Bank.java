package chapter08;

public class Bank {
	
	private String point; // 지점명
	private String tel;
	static float interest; //이자율은 은행마다 같아야 한다 (공통으로 쓰이는 경우)
	
	public Bank (String point,String tel) {
		this.point = point;
		this.tel = tel;
	}
	
	
	//결과를 출력할 메소드
	
	public void getbank() {
		System.out.println("지점 : " + point + " \n" + "은행이자 : " + interest);
		
	}
	
	

}
