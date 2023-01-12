package chapter08;

class StVal{
	int a;
	static int b; //
	
}

public class StaticTest {

	public static void main(String[] args) {
		StVal obj1 = new StVal(); //같은 클라스를 공유하고 있지만 독립적인 메모리 공간을 가지고 있음
		StVal obj2 = new StVal(); //다만 static으로 전역변수로 변경하는 경우에는 
		
		
		obj1.a = 10;
		obj1.b = 20;
		System.out.println("obj1.a : " + obj1.a + "| obj1.b : " + obj1.b) ;
		System.out.println("------------------------------");
		//static은 데이터 영역에서 고용ㅇ으로 사용되므로 다른 객체에서 값을 변경하려면 견경된 값을 적용함
		obj2.a = 100;
		obj2.b = 200;
		System.out.println("obj2.a : " + obj2.a + "| obj2.b : " + obj2.b) ;
		System.out.println("------------------------------");
		System.out.println("obj1.a : " + obj1.a + "| obj1.b : " + obj1.b) ; 
		//다른 주소의 다른 객체지만 b 값이 static으로 지정하고 Stack에 저장되었기 때문에 (전역변수)값이 고정된다
		obj2.b = 300;
		System.out.println("obj1.a : " + obj1.a + "| obj1.b : " + obj1.b) ; 
		
	}
}
