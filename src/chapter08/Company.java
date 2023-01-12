package chapter08;

public class Company {
	
	//객체를 단 하나만 생성하는 클래스 (SingleTon이라고 한다)
	private static Company instance = new Company();
	//객체 자체에 static으로 만들수 있다
	//보통 총 합계를 구하는 경우에 사용함
	
	//일반적인 객체 생성
	
	public Company() {
		
		
	}
	
	//singleton 객체 생성 메서드 (private라서 메서드를 통해 return 가능함)
	public static Company getInstance() {
		//예외처리 
		if(instance == null) {
			instance = new Company();
			
		}
		return instance;
		
	}
	
	
	
	
	
}
