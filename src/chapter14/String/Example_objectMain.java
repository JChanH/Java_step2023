package chapter14.String;

public class Example_objectMain {

	public static void main(String[] args) {


		
		//object는 모든 자료를 읽는것이 가능함
		Example_object v1 = new Example_object();
		v1.setValue("test"); //String 이지만 이미 Object가 상속되어 있으므로 자동 형변환이 이루어짐 
		
		System.out.println(v1.getValue());
		
		//정수(int)로 인자값을 대입
		Example_object v2 = new Example_object();
		v2.setValue(100); //AutoBoxing 기본자료형 int = 객체(Object)
		System.out.println(v2.getValue());
		
		
		int i = (int)v2.getValue(); //unBoxing (어떤 자료인지 명시적으로 정해주어야 함)
		System.out.println(i+2);
		
		
		
		
		
		
		
		
		
		
	}

}
