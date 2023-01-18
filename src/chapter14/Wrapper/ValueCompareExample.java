package chapter14.Wrapper;

public class ValueCompareExample {

	public static void main(String[] args) {
		//오토박싱 상황에서는 1byte초과시 바교판단이 안됨
		System.out.println("[-128 ~ 128 초과값일 경우]"); //1byte = 8bit
		Integer obj1 = 300; //4바이트 =>32비트
		Integer obj2 = 300; 
		
		
		//주소를 비교
		System.out.println("==결과" + (obj1 == obj2)); //값이 초과하여서 각각 다른 heap위치 클래스에 있기때문에 같지 않다 (외부의 hashcode값으로 비교함)
		System.out.println("==언박싱 한후 결과" + (obj1.intValue() == obj2.intValue())); // 클래스 내부의 숫자 값을 비교함
		
		//----------------------------------------------------
		System.out.println("[-128 ~ 128 범위값 경우]"); //1byte = 8bit
		Integer obj3 = 100; //4바이트 =>32비트
		Integer obj4 = 100; 
		
		
		//주소를 비교
		System.out.println("==결과" + (obj3 == obj4)); //값이 초과하지 않았기 때문에 내부 값을 비교한다
		System.out.println("==언박싱 한후 결과" + (obj3.intValue() == obj4.intValue())); // 클래스 내부의 숫자 값을 비교함
		System.out.println("equal 결과 :" + obj3.equals(obj4)); //같다고 나옴
		
		
	}

}
