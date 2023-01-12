package chapter08;

public class StaticFunctionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticFunction obj = new StaticFunction();
		System.out.println(obj.str2); //static으로 바로 끌어다가 사용 가능함으로 경고 표시가 뜬다(코드는 길어지면 좋지 않은 코드임)
		String s = obj.getStatic();
		System.out.println(s);
		
		
		//static은 객체없이 사용가능함
		String str;
		str = StaticFunction.getStatic(); //StaticFunction(Class)의 getStatic(메소드)를 바로 불러서 값을 넣어주는 것도 가능하다
		System.out.println(str); //동일하게 VIP를 출력해준다
		
	}

}
