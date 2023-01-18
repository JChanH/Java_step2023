package chapter14.Wrapper;

public class BoxingUnboxingExample {

	public static void main(String[] args) {
		// AutoBoxing (Integer)
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(100);

		Integer obj3 = Integer.valueOf(300); //입력받은 인자값을 지정된 객체형으로 변환하여 반환함

		Integer total1 =obj1+obj2;
		Integer total2 =obj2+obj3;
		
		
		System.out.println("Integer total :" + total1); //100 + 100
		System.out.println("Integer total :" + total2); //100 + 300
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2; //Interger의 언박싱은 굳이 intValue(); 를 붙이지 않아도 됨 (Auto unboxing) 
		int value3 = obj3.intValue();
		Integer total3 =value1 + value2; //언박싱하여도 호환이 됨 (다시 AutoBoxing 가능하다)
		Integer total4 =value2 + value3;
		
		System.out.println("Integer total3 :" + total3);
		System.out.println("Integer total4 :" + total4);
		
		
	}
}
