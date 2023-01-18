package chapter14.Wrapper;

public class AutoBoxingUnboxingExample {

	public static void main(String[] args) {
		//AutoBoxing (
		//Integer obj = new Integer(17);  //클라스 Integer는 더이상 사용하지 않음 (자동으로 Boxing 가능함)
		Integer obj = 100; //클라스 상태
		System.out.println("value : " + obj.intValue()); //Integer클래스에 intValue라는 메소드가 있음 (등록된 Value 값을 return해줌)
		
		//obj를 언박싱으로 자동 변환
		int value = obj; 
		System.out.println("value : " + value);
		
		//연산시 자동 unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
		
		
	}

}
