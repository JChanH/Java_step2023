package chapter09;


//다중상속
public class StrawBerry extends Berry { //berry에게 상속받으면 Berry + Fruit 임으로 같이 들어온다

	private String color;
	private int price;
	
	//setter
		public void Set3(String a, int b) {
			color=a;
			price = b;
			
			
			
		}
		
		
		//getter
		public void Disp3() {
			System.out.println("색깔 : " + color);
			System.out.println("가격 : " + price);
			
			
		}
	
}
