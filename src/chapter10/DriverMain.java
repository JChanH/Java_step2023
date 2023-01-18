package chapter10;

public class DriverMain {
	public static void main(String[] args) {
		Driver D = new Driver(); //드라이버 클라스를 불러와준다.
		
		D.drive(new Bus()); //드라이버에 
		
		Taxi taxi = new Taxi();
		D.drive(taxi); //어쩌피 메개변수를 사용하여 들어가는것은 같다 
		
		
	}
}
