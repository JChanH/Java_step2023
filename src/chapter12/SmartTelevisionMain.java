package chapter12;

public class SmartTelevisionMain {

	
	public static void main(String[] args) {
		
		SmartTelevision tv = new SmartTelevision();
		
		
		tv.turnOn();
		tv.setVolume(15);
		tv.turnOff();
		tv.search("www.naver.com");
		System.out.println("-----------------");
		
		
		Remote rc = tv; //메개변수를 어어받는게 가능함(Remote에 있는 변수들만 사용가능
		rc.turnOn();
		rc.turnOff();
		//rc.search(); 는 사용 불가능함
		
		
		
		System.out.println("-----------------");
		Searchable se = tv;
		se.search("www.naver.com");
		//se.turnOff(); 동일하게 넘겨받아도 자기한테 있는것만 사용 가능함 (덥어쓰기해서 overriding만 인식시켜 주는 것임)
		
		
		
		
		
	}
}
