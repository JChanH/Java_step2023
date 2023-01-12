package chapter08;

public class StaticFunction {

	String str1= "일반 회원변수";
	static String str2= "Static 회원변수";
	
	public static String getStatic() { //static의 메서드는 static으로만 사용 가능하다 //static = data영역, 메서드는 stack영역
		//static 메서드는 static 변수만 사용이 가능하다 (같은 메모리 영역만 변수 지정 가능 
		str2 = "VIP";
		
		return str2;
	}
	
}
