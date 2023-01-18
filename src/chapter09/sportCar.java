package chapter09;

public class sportCar extends Car {

	
	
	
	@Override
	public void speedUp() {
		speed +=10;
		System.out.println("speed : " + speed);
	}
/*//Car에서 final로 지정해주었기 때문에 override를 해주지는 못한다
	public void stop() {

		System.out.println("스포츠카가 멈춥니다");
		speed=0;
	}
*/
	public static void main(String[] args) {
		sportCar ac =new sportCar();
		ac.speedUp(); //stack은 선출후납이라 최근에 수정된 값이 들어감
		ac.stop();
		ac.speedUp(); 
		
	}
}
