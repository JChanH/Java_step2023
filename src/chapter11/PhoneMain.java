package chapter11;

public class PhoneMain {
	public static void main(String[] args) {
		//Phone phone = new Phone(); //추상 클라스라서 안만들어 짐 
			
		SmartPhone smartPhone = new SmartPhone("김유신");
		System.out.println(smartPhone.owner + "님");
		smartPhone.intersearch();
		smartPhone.turnoff();
		
		
	}
}
