package chapter13;

public class AnonyInner {

	public void test() {
		
		new TestInter() { //Runnable 개념으로 사용 가능함 (객체명은 없고 메서드만 존재함)

			@Override
			public void printData() {
				System.out.println("화욜팅");
			}//추상메서드 구현
			
		}.printData(); //heap메모리에 저장되어 있음 
		
	}//메소드

	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test(); // 메소드 내부의 오버라이딩된 printData까지 호출함 (간단한 이벤트 호출하는데 유용함)
		
		
		
	}

}
